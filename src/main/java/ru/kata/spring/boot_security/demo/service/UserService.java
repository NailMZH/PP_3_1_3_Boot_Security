package ru.kata.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    User findById(Long id);
    List<User> findAll();
    void saveUser(User user, String[] selectedRoles);
    void deleteById(Long id);
    User getUserByUsername(String username);
    public void save(User user);
}
