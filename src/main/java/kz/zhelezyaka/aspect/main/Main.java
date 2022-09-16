package kz.zhelezyaka.aspect.main;

import kz.zhelezyaka.aspect.config.ProjectConfig;
import kz.zhelezyaka.aspect.model.Comment;
import kz.zhelezyaka.aspect.services.CommentService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.logging.Logger;

public class Main {
    private static Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {

        var c = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var service = c.getBean(CommentService.class);

        Comment comment = new Comment();
        comment.setText("Test comment");
        comment.setAuthor("Vladimir");

        String value = service.publishComment(comment);
        logger.info(value);
    }
}
