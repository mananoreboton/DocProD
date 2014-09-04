package com.borabora.drivedocprocessor.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Borabora Systems
 * Created by mananoreboton on 17/08/14.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/").hasRole("USER")
                .anyRequest()
                .permitAll()
                .and()
                .logout()
                .logoutSuccessUrl("/home")
                .logoutUrl("/logout")
                .permitAll()
                .and()
                .formLogin()
                .loginPage("/home")
                .failureUrl("/home?error=true")
                .permitAll();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("usuario").password("usuario").roles("USER").and()
                .withUser("admin").password("admin").roles("ADMIN", "USER");
    }
}