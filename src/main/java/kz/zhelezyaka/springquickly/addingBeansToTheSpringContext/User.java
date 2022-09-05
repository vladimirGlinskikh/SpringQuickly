package kz.zhelezyaka.springquickly.addingBeansToTheSpringContext;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class User {
    private String name;
    private int age;

    @PostConstruct
    public void init(){
        this.name = "Vladimir";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
