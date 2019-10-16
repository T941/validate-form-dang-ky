package codegym.repository;

import codegym.model.User;

import java.util.List;

public interface UserRepository {
    List<User> findAll();
    void save(User user);
}
