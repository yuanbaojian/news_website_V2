//package com.ybj.news_website.config;
//
//import nz.net.ultraq.thymeleaf.LayoutDialect;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
//import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
//import org.springframework.web.servlet.handler.BeanNameUrlHandlerMapping;
//import org.thymeleaf.spring5.SpringTemplateEngine;
//import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
//import org.thymeleaf.spring5.view.ThymeleafViewResolver;
//
//public class thymeleafConfig extends WebMvcConfigurationSupport {
//
//    private ApplicationContext applicationContext;
//
//    protected void addResourceHandlers(ResourceHandlerRegistry registry)
//    {
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static");
//        super.addResourceHandlers(registry);
//    }
//
//    @Bean
//    @ConfigurationProperties(prefix = "spring.thymeleaf")
//    public SpringResourceTemplateResolver templateResolver()
//    {
//        SpringResourceTemplateResolver resolver=new SpringResourceTemplateResolver();
//        resolver.setCharacterEncoding("UTF-8");
//        return  resolver;
//    }
//
//    @Bean
//    public SpringTemplateEngine templateEngine()
//    {
//        SpringTemplateEngine templateEngine=new SpringTemplateEngine();
//        templateEngine.setTemplateResolver(templateResolver());
//        templateEngine.setEnableSpringELCompiler(true);
//        templateEngine.addDialect(new LayoutDialect());
//        return templateEngine;
//    }
//
//    @Bean
//    public ThymeleafViewResolver viewResolver()
//    {
//        ThymeleafViewResolver thymeleafViewResolver=new ThymeleafViewResolver();
//        thymeleafViewResolver.setTemplateEngine(templateEngine());
//        return  thymeleafViewResolver;
//    }
//}
