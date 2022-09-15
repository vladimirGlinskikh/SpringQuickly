package kz.zhelezyaka.aspect.main;

import kz.zhelezyaka.aspect.config.ProjectConfig;
import kz.zhelezyaka.aspect.model.Comment;
import kz.zhelezyaka.aspect.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Test comment");
        comment.setAuthor("Vladimir");
        service.publishComment(comment);
    }
}
