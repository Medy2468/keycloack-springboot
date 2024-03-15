package com.groupeisi.service;

import com.groupeisi.entity.User;
import com.groupeisi.repository.UserRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @PostConstruct
    public void initializeUserTable() {
        User user1 = new User();
        user1.setNom("NSANGOU");
        user1.setPrenom("Medy");
        user1.setEmail("medy@gmail.com");
        user1.setPassword("password1");
        userRepository.save(user1);

        User user2 = new User();
        user2.setNom("NSANGOU");
        user2.setPrenom("Lord");
        user2.setEmail("lord@gmail.com");
        user2.setPassword("password2");
        userRepository.save(user2);

        User user3 = new User();
        user3.setNom("NSANGOU");
        user3.setPrenom("Exauce");
        user3.setEmail("exauce@gmail.com");
        user3.setPassword("password3");
        userRepository.save(user3);
    }

    public User getUser(int userId) {
        return userRepository
                .findById(userId)
                .orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
