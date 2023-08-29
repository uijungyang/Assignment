package org.koreait.configs;
// 스프링 시큐리티 관련 설정 추가

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration  // 스프링쪽에서 설정으로 인식
public class SecurityConfig {
    @Bean  // 스프링이 관리하는 객체로 설정
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
        return http.build();
        // 시큐리티 무력화(?)
    }

    @Bean // 스프링이 관리
    public WebSecurityCustomizer webSecurityCustomizer(){
        return w -> w.ignoring().requestMatchers("/css/**", "/js/**","/images/**", "/error/**"); //스프링과 관련없이 그냥 접근할 수 있는 주소
    }
}
