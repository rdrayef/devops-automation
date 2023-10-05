package org.mql.dev.devopsintegration.controllers;


import org.mql.dev.devopsintegration.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Vector;

@RestController
@RequestMapping("/users")

public class UserController {
    @Autowired
    private User u0;

    @Autowired
    private User u1;

    private List<User> users=new Vector<>();

    @GetMapping
    public List<User> getUsers(){
        users.add(u0);
        users.add(u1);
        return users;
    }


}
