package com.example.instagramLogin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;



    public void registerUser(User user) {
        user.setPassword((user.getPassword()));
        userRepository.save(user);
    }


}
