package com.example.spring7.config;

import com.example.spring7.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;


@Configuration
@EnableWebSecurity
public class WebSecurityConfig {
    @Autowired
    UserService userService;



    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity
                .csrf()
                .disable()
                .authorizeHttpRequests((requests) -> {
                    try {
                        requests
                        //Доступ только для не зарегистрированных пользователей
                        .requestMatchers("/registration").fullyAuthenticated()
                        //Доступ только для пользователей с ролью Администратор
                        .requestMatchers("/admin/**").hasRole("ADMIN")
                        .requestMatchers("/news").hasRole("USER")
                        //Доступ разрешен всем пользователей
                        .requestMatchers("/", "/resources/**").permitAll()
                        //Все остальные страницы требуют аутентификации
                        .anyRequest().authenticated()
                        .and()
                        //Настройка для входа в систему
                        .formLogin()
                        .loginPage("/login")
                        //Перенарпавление на главную страницу после успешного входа
                        .defaultSuccessUrl("/")
                        .permitAll()
                        .and()
                        .logout()
                        .permitAll()
                        .logoutSuccessUrl("/");
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                });

        return httpSecurity.build();
    }

}
