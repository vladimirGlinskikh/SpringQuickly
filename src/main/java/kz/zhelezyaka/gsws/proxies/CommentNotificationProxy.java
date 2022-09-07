package kz.zhelezyaka.gsws.proxies;

import kz.zhelezyaka.gsws.model.Comment;

public interface CommentNotificationProxy {
    void sendComment(Comment comment);
}
