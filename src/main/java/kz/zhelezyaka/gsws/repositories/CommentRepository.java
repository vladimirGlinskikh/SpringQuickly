package kz.zhelezyaka.gsws.repositories;

import kz.zhelezyaka.gsws.model.Comment;

public interface CommentRepository {
    void storeComment(Comment comment);
}
