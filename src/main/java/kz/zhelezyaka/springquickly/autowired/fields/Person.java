package kz.zhelezyaka.springquickly.autowired.fields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private Parrot parrot;

    public String getName() {
        return "Vladimir";
    }

    public Parrot getParrot() {
        return parrot;
    }
}
