package kz.zhelezyaka.areasOfVisibilityBean.services;

import kz.zhelezyaka.areasOfVisibilityBean.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    @Autowired
    private CommentRepository repository;

    public CommentRepository getRepository() {
        return repository;
    }
}
