package kz.zhelezyaka.areasOfVisibilityBean;

import kz.zhelezyaka.areasOfVisibilityBean.services.CommentService;
import kz.zhelezyaka.areasOfVisibilityBean.services.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var cs1 = c.getBean(CommentService.class);
        var cs2 = c.getBean(UserService.class);

        System.out.println(cs1.getRepository() == cs2.getRepository());
    }
}
