//package top.simba1949.config;
//
//import org.springframework.context.annotation.Configuration;
//import org.springframework.stereotype.Component;
//import org.springframework.util.ResourceUtils;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
//
///**
// * @author simba1949@outlook.com
// * @date 2018/9/15 10:52
// */
//
//@Configuration
//@Component
//public class MvcConfig implements WebMvcConfigurer {
//    /**
//     * 添加静态资源文件，外部可以直接访问地址
//     *
//     * @param registry
//     */
//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/**").addResourceLocations("classpath:/static/");
//    }
//}
