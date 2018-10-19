package com.endava.apiexample.feature1.services;

import com.endava.apiexample.feature1.domain.User;
import com.endava.apiexample.feature1.repositories.UserRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@EnableScheduling
@Configuration
@Service


public class UserService {
    @Autowired
    private UserRespository repo;

    public List<User> getAllUsers (){
        List<User> users=new ArrayList<>();
        repo.findAll().forEach(user->users.add(user));
        return users;
    }

    public User getUserById(long id){
        return repo.findById(id).orElse(null);
    }

    public void insertUser(User u){
        repo.save(u);
    }
}
