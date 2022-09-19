package ir.maktab.service;

import ir.maktab.base.BaseService;
import ir.maktab.domain.User;
import ir.maktab.enumiration.Gender;

public interface UserService extends BaseService<User> {
    boolean existsByUsername(String username);
    User findByUsername(String username);
    User signup(String firstname, String lastname, String username, String password, Gender gender);
    User login(String username, String password);
    void refreshUser(User user);
}