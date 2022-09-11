package kz.zhelezyaka.areasOfVisibilityBean;

import kz.zhelezyaka.areasOfVisibilityBean.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        System.out.println("Before retrieving the CommentService");
        var service = c.getBean(CommentService.class);
        System.out.println("After retrieving the CommentService");

        var cs1 = c.getBean("commentService", CommentService.class);
        var cs2 = c.getBean("commentService", CommentService.class);

        System.out.println(cs1 == cs2);
    }
}
