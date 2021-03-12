package com.diary.d4jh.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import org.springframework.web.servlet.config.annotation.*;

@Configuration
public class WebMvcConfig implements WebMvcConfigurer {



//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/")
//                .setViewName("forward:/login");
//        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//    }

//        @Override
//        public void configureViewResolvers(ViewResolverRegistry registry) {
//            MustacheViewResolver mustacheViewResolver = new MustacheViewResolver();
//            mustacheViewResolver.setCharset("UTF-8");
//            mustacheViewResolver.setContentType("text/html; charset=UTF-8");
//            mustacheViewResolver.setPrefix("classpath:/templates/"); // Prefix 설정
//            mustacheViewResolver.setSuffix(".mustache"); // Suffix 설정
//            registry.viewResolver(mustacheViewResolver); // 위에서 생성한 Mustache 리졸버를 적용
//
//    }

}
