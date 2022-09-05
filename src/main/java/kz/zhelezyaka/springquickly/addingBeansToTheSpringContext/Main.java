package kz.zhelezyaka.springquickly.addingBeansToTheSpringContext;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cats cats = new Cats();

        cats.setName("Sasha");

        Supplier<Cats> catsSupplier = () -> cats;

        context.registerBean("cats",
                Cats.class,
                catsSupplier,
                beanContext -> beanContext.setPrimary(true));

        Cats catsBean = context.getBean(Cats.class);
        System.out.println(catsBean.getName());
    }
}
