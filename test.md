实践出真知， 必须通过不断的实践， 才能提高业务处理能力

## What
责任链模式将每个节点都看作是一个对象，每个节点处理的请求都不同（接受的参数相同）
系统内自动维护节点顺序，可以使流程线性或者环形运行。

使用场景
公司内的事务通常是多部门协作完成的，每个部门有自己的职责，每个部门做对应的事情，当所有部门完成时，事情才算做完，“过五关，斩六将”其实也是职责链的一种使用场景。
这里的责任链是实际上是一条固定的链路，利用转发进行业务拆分处理，这里与网上的请假案例有些许区别，但是通用性更强，能更好的帮助编码者梳理逻辑，进行抽象处理。

主要作用是：解耦请求与处理，只需将请求发送到链路上就行了，不用关心具体细节，请求会自动传递
uml图

不支持在 Docs 外粘贴 block



组成

1. 抽象实现类
  1. 定义一个请求处理方法
这个由具体实现类实现

  2. 维护下一个节点的引用
这个可以由linkedList或者arrayList的有序性代替

  3. 参数
形参可由组合的方式进行组装，不进行单个参数的传递，传递一个大的对象引用

2. 具体实现类
对请求进行处理， 并对形参进行修改，便于下个节点使用


3. 责任链客户端
用于职责链的流转引导, 对外暴露责任链的接口。
@Component
public class SaveTrackChain {


    List<VmsSaveTrackHandler> chainList = new LinkedList<>();

    @Autowired
    VmsSavePreviewTrackHandler vmsSavePreviewTrackHandler;

    @Autowired
    VmsSaveDownTrackHandler vmsSaveDownTrackHandler;
    .....

    @PostConstruct
    public void init(){
        chainList.add(vmsSaveCreateTrackHandler);
        chainList.add(vmsSavePreviewTrackHandler);
        chainList.add(vmsSaveDownTrackHandler);
        chainList.add(vmsSaveShareTrackHandler);
        chainList.add(vmsSaveHotTrackHandler);
        chainList.add(vmsSaveToDBHandler);
        chainList.add(vmsSaveToESHandler);
    }

    public  void exe(CoreDTO calHotChainDTO)  {
        for (VmsSaveTrackHandler handler : chainList) {
            handler.execute(calHotChainDTO);
        }
    }

}


优缺点
优点
1. 将请求与处理解耦
只需要添加一个chainList类就能装配请求流转， 将一个完整的业务流转变为多个节点共同完成

@PostConstruct
public void init(){
    chainList.add(getExcelHandler);
    chainList.add(coreAttrHandler);
    chainList.add(coreRoleUserHandler);
    chainList.add(nodeUserHandler);
    chainList.add(smsConfigHandler);
}




2. 当前节点只需要关注自己的请求处理即可
这个划分就相当明确

3. 具备链式传递功能，请求者不需要知晓链路结构，只需要等待处理结果即可

4. 联系结构灵活，可以动态的新增或者增删职责

5. 易于扩展（责任节点），符合开闭原则
这个的确是符合开闭原则， 原有的类根本不需要动， 增加个处理节点类就行啦

缺点
1. 职责链太长或时间过长，会影响性能
的确是这样， 因为大部分是顺序执行
解决办法：可以用多线程处理节点上的任务或者加强数据库性能

  1. 使用多线程处理
因为是责任链+多线程，单个职责节点的返回值就不太好处理，所以适合不易报错且不急需返回值的接口。任务切分成若干个，分批进行职责链处理。

分批调用职责链
for (int i = 0; i < exeCount; i++) {
    saveToTrackAttr(i,countDownLatch,exeTotalCount);
}




使用多线程进行职责链的调用
@Autowired
ExecutorService myPool;

private void saveToTrackAttr(int i, CountDownLatch countDownLatch, LongAdder exeTotalCount) {
    myPool.execute( ()->{
        try{
            .....
            saveTrackChain.execute(calHotChainDTO);
        } catch (Exception e){
            log.error("子线程发送异常，错误信息为 {}",e);
        } finally {
            countDownLatch.countDown();
        }
    });
}


注：子线程的异常需要用try catch 捕获， 否则不会显示抛出，导致排查问题麻烦

  2. 加快sql的处理速度
比如不适用mybatis plus 的saveBatch方法， 自己手动写xml进行数据的插入
同时使用恰当的索引，进行数据库加速。

2. 如果存在循环应用，会导致死循环，进而系统崩溃
这条链路的确可能存在死循环的可能，如果是固定的链路，虽然灵活性差，但是不会出现死循环的问题。
