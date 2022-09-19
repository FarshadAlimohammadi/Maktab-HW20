package ir.maktab.service.impl;

import ir.maktab.base.impl.BaseServiceImpl;
import ir.maktab.domain.Ticket;
import ir.maktab.domain.User;
import ir.maktab.enumiration.Gender;
import ir.maktab.repository.UserRepository;
import ir.maktab.service.UserService;

import java.util.ArrayList;
import java.util.Objects;

public class UserServiceImpl extends BaseServiceImpl<User, UserRepository> implements UserService {
    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }

    @Override
    public boolean existsByUsername(String username) {
        return repository.existsByUsername(username);
    }

    @Override
    public User findByUsername(String username) {
        return repository.findByUsername(username);
    }



    @Override
    public User signup(String firstname, String lastname, String username, String password, Gender gender) {
        if (existsByUsername(username)){
            return null;
        }
        User user = new User();
        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setUsername(username);
        user.setPassword(password);
        user.setGender(gender);
        user.setTicket(new ArrayList<Ticket>());
        save(user);
        return user;
    }

    @Override
    public User login(String username, String password) {
        User passenger;
        if(existsByUsername(username)){
            passenger = findByUsername(username);
        }else {
            System.out.println("costumer not exists!");
            return null;
        }
        if (Objects.equals(passenger.getPassword(), password)){
            System.out.println("login success...");
            return passenger;
        }else {
            System.out.println("wrong password");
            return null;
        }
    }

    @Override
    public void refreshUser(User user) {
        beginTransAction();
        repository.refreshUser(user);
        commitTransaction();
    }
}
