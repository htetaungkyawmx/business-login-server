package com.example.businessloginserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityBuilder;
import org.springframework.security.config.annotation.web.WebSecurityConfigurer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
public class ProjectConfig implements WebSecurityConfigurer {

 @Bean
    public PasswordEncoder passwordEncoder(){
     return new BCryptPasswordEncoder();
 }


    protected void configure(HttpSecurity httpSecurity) throws Exception {
     httpSecurity.csrf().disable();
     httpSecurity.authorizeRequests()
             .anyRequest().permitAll();
    }

    @Override
    public void init(SecurityBuilder builder) throws Exception {

    }

    @Override
    public void configure(SecurityBuilder builder) throws Exception {

    }
}
