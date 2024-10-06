package com.moono.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {
	@Override
	public void addCorsMappings (CorsRegistry registry) {
		registry.addMapping("/api/**") //모든 경로에 대해
		.allowedOrigins("https://moono-stroy.vercel.app") //허용할 도메인
		.allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") //허용할 HTTP 메서드
		.allowedHeaders("*") //허용할 헤더
//        .allowedHeaders("Authorization", "Content-Type")
		.allowCredentials(true); //인증정보 허용
	}

}
