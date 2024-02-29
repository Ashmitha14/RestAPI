package com.example.review.service;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.review.model.User;
import com.example.review.repositary.UserRepo;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public List<User> getUserdetails(){
        return userRepo.findAll();
    }

    public User addUser(User user)
    {return userRepo.save(user);
    }
    
    public Optional<User> findUser(Long id){
        return userRepo.findById(id);
    }
    public User editUser(Long id,User user)
    {   User userAvail=userRepo.findById(id).orElse(null);
        if(userAvail!=null)
        {
            userAvail.setUserId(user.getUserId());
            userAvail.setUserName(user.getUserName());
            userAvail.setPassword(user.getPassword());
            return userRepo.saveAndFlush(userAvail);
        }
        else
        return null;
    }
    public String deleteUser(Long id)
    {
        userRepo.deleteById(id);
        return ("User deleted");
    }
}
