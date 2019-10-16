package codegym.service;

import codegym.model.User;

import java.util.List;

public interface UserService {
    List<User> findAll();
    void save(User user);
}
