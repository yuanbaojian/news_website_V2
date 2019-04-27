// 搜索js
function onKeyDown(event){
    var e = event || window.event || arguments.callee.caller.arguments[0];
    if(e){ // e存在变化
        //要做的事情
        var ev=$('#seek').val();
        $('#indexseek').empty()
        var tt="";
        $.post('/getindexseek',{"t_article_title_1":ev},function (result) {
            for (var j=0;j<result.length;j++){
                tt+="<tr>"+
                    "<td><a href=\"/article/"+result[j].t_article_id+"\">"+result[j].t_article_title_1+"</a></td>"+
                    "</tr>"
            }
            $('#indexseek').append(tt);
        },'json')
    }
    if(e && e.keyCode==13){ // enter 键
        // alert("此处回车触发搜索事件");
        // window.location.href='/clickseek/'+ev;
    }
    // $('#qd_sousuo').click(function () {
    //     //对点击搜索按钮做出处理
    //     // alert("此处为点击事件");
    //     // window.location.href='/clickseek/'+ev;
    // })
}