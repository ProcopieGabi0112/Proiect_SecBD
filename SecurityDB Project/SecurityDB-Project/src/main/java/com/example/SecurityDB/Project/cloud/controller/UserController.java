package com.example.SecurityDB.Project.cloud.controller;

import com.example.SecurityDB.Project.cloud.model.User;
import com.example.SecurityDB.Project.cloud.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;


import java.util.List;



//@RestController

public class UserController {


    /*
    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public String saveUser(@RequestBody User user)
    {
        userService.saveUser(user);
        return "User with  [id:" + user.getId()+ "- last_name: "+user.getLast_name()+"- first_name: "+user.getFirst_name()+" ] was created";
    }
    @GetMapping("/findAllUsers")
    public List<User> getUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/findAllUsers/{id}")
    public User getUsersById(@PathVariable Long id){
        return userService.getUserById(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deteleUser(@PathVariable long id){
        userService.deleteUserById(id);
        return "User deleted with id:" + id;
    }
*/

}
