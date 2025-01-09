package com.wimoor.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @package: com.wimoor.gateway.config
 * @className: CorsConfig
 * @author: alexwang
 * @description: TODO
 * @date: 2025/1/9 14:41
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins("*") // 允许来自http://localhost的请求
                .allowedMethods("*") // 允许的HTTP方法
                .allowedHeaders("*"); // 允许的HTTP头部
    }
}
