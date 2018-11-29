package ru.home;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;

/**
 * Created on 10.11.2018.
 *
 * @Author Sergey P.
 */

@SpringBootApplication(scanBasePackages = "ru.home.*")
@EnableJpaRepositories(basePackages = "ru.home.repository")
@EntityScan(basePackages = "ru.home.model")
@EnableResourceServer
public class OrderServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(OrderServiceApplication.class, args);
    }

}
