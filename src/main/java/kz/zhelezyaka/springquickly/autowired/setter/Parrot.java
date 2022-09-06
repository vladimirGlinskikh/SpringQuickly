package kz.zhelezyaka.springquickly.autowired.setter;

import org.springframework.stereotype.Component;

@Component
public class Parrot {
    private final String name = "Yasha";

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Parrot{" +
                "name='" + name + '\'' +
                '}';
    }
}
