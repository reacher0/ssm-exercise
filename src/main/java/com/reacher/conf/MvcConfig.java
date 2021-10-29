package com.reacher.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

@Configuration
public class MvcConfig {

    /**
     * 文件上传注册CommonsMultipartResolver
     * @return
     */
    @Bean("multipartResolver")
    public CommonsMultipartResolver getResolver(){
        CommonsMultipartResolver commonsMultipartResolver = new CommonsMultipartResolver();
        return commonsMultipartResolver;
    }
}
