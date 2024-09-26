package com.example.instagramLogin;

import com.example.instagramLogin.User;
import com.example.instagramLogin.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {

    @Autowired
    private UserService userService;



    @GetMapping("/login")
    public String register() {
        return "register";
    }

    @PostMapping("/login")
    public String registerUser(User user) {
        userService.registerUser(user);
        return "redirect:/login";
    }



    @GetMapping("/home")
    public String home() {
        return "home"; // Create a home.html for the landing page after login
    }
}
