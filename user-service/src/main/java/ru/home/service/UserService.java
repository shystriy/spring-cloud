package ru.home.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.home.model.User;
import ru.home.repository.UserRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAll() {
        return userRepository.findAll();
    }

    public User get(Long userId) {
        return userRepository.findOne(userId);
    }

    @Transactional
    public User save(User user) {
        return userRepository.save(user);
    }


}
