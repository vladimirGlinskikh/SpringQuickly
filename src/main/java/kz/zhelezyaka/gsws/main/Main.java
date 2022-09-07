package kz.zhelezyaka.gsws.main;

import kz.zhelezyaka.gsws.model.Comment;
import kz.zhelezyaka.gsws.proxies.EmailCommentNotificationProxy;
import kz.zhelezyaka.gsws.repositories.DBCommentRepository;
import kz.zhelezyaka.gsws.services.CommentService;

public class Main {
    public static void main(String[] args) {
        var commentRepository = new DBCommentRepository();
        var commentNotificationProxy = new EmailCommentNotificationProxy();

        var commentService = new CommentService(commentRepository, commentNotificationProxy);

        var comment = new Comment();
        comment.setAuthor("Vladimir");
        comment.setText("Test text");

        commentService.publishComment(comment);
    }
}
