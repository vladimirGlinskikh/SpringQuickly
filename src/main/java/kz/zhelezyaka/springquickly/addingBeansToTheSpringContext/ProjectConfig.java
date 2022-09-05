package kz.zhelezyaka.springquickly.addingBeansToTheSpringContext;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "kz.zhelezyaka.springquickly.addingBeansToTheSpringContext")
public class ProjectConfig {

    @Bean
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Yasha");
        return p;
    }

    @Bean
    String heyBean() {
        return "Hello Bean";
    }

    @Bean
    Integer number() {
        return 7;
    }
}
