package ir.maktab.repository;

import ir.maktab.base.BaseRepository;
import ir.maktab.domain.User;

public interface UserRepository extends BaseRepository<User> {
    boolean existsByUsername(String username);
    User findByUsername(String username);
    void refreshUser(User user);
}
