package com.endava.apiexample.feature1.controllers;

import com.endava.apiexample.feature1.domain.User;
import com.endava.apiexample.feature1.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.lang.reflect.Member;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public Response getAllUsers(){
        return  Response.ok().entity(userService.getAllUsers()).build();
    }


    @GetMapping(path = "/{id}")
    public Response getUserById(@PathVariable long id){
        return Response.ok().entity(userService.getUserById(id)).build();
    }

    @PostMapping(path = "",consumes = MediaType.APPLICATION_JSON)
    public Response insertUser(@RequestBody User user){
        userService.insertUser(user);
        return Response.status(201).build();
    }
}
