package com.moono.config;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .cors() // CORS 설정 허용
            .and()
            .csrf().disable() // CSRF 비활성화 (필요시)
            .authorizeRequests()
            .antMatchers("/api/user/login", "/api/user/register", "/api/user/check-id").permitAll() // 특정 경로 허용
            .anyRequest().authenticated(); // 그 외 경로는 인증 필요

        return http.build();
    }
}
