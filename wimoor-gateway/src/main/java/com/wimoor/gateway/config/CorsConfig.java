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
                .allowedOriginPatterns("*") // 使用 allowedOriginPatterns 而不是 allowedOrigins
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowCredentials(true) // 如果不需要发送凭证信息，可以设置为 false
                .maxAge(3600); // 设置预检请求缓存时间
    }
}
