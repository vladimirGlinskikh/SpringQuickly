package kz.zhelezyaka.areasOfVisibilityBean.services;

import kz.zhelezyaka.areasOfVisibilityBean.repositories.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    public UserService() {
        System.out.println("UserService instance created!");
    }
}
