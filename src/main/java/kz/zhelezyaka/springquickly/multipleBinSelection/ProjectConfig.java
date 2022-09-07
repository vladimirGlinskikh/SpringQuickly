package kz.zhelezyaka.springquickly.multipleBinSelection;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

    @Bean
    public Parrot parrot1() {
        Parrot parrot = new Parrot();
        parrot.setName("Yasha");
        return parrot;
    }

    @Bean
    public Parrot parrot2() {
        Parrot parrot = new Parrot();
        parrot.setName("Kesha");
        return parrot;
    }

    @Bean
    public Parrot parrot3() {
        Parrot parrot = new Parrot();
        parrot.setName("Gesha");
        return parrot;
    }

    @Bean
    public Person person(@Qualifier("parrot1") Parrot parrot) {
        Person person = new Person();
        person.setName("Vladimir");
        person.setParrot(parrot);
        return person;
    }
}
