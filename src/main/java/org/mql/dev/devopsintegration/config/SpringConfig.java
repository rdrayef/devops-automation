package org.mql.dev.devopsintegration.config;

import org.mql.dev.devopsintegration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:users.xml")
public class SpringConfig {
    @Autowired
    private User adminUser;
    @Autowired
    private User defaultUser;

    @Bean
    public User u0(){
        return defaultUser;
    }

    @Bean
    public User u1(){
        return adminUser;
    }
}
