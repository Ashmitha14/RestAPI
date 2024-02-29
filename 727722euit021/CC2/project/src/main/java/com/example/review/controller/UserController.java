package com.example.review.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.review.model.User;
import com.example.review.service.UserService;

@RestController
//@RequestMapping(“/api1”)
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("/adduser")
    public User addUser(@RequestBody User user){
        return userService.addUser(user);
    }
    @GetMapping("/findusers")
        public List<User> findUsers()
        { return userService.getUserdetails();
        }

    @GetMapping("/finduser/{id}")
        public Optional<User> findUsers(@PathVariable Long id)
        { return userService.findUser(id);
        }
    @PutMapping("/edituser/{id}")
    public User editUser(@PathVariable Long id, @RequestBody User user)
    {  return userService.editUser(id, user);
    }
    @DeleteMapping("/deleteuser/{id}")
    public String deleteUser(@PathVariable Long id){
        return userService.deleteUser(id);
    }
}

