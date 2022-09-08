package kz.zhelezyaka.gsws.main;

import kz.zhelezyaka.gsws.config.ProjectConfiguration;
import kz.zhelezyaka.gsws.model.Comment;
import kz.zhelezyaka.gsws.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);

        var comment = new Comment();
        comment.setAuthor("Vladimir");
        comment.setText("Test comment");

        var commentService = context.getBean(CommentService.class);
        commentService.publishComment(comment);
    }
}
