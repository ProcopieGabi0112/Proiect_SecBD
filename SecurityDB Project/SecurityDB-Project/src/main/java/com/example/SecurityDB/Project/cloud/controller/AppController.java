package com.example.SecurityDB.Project.cloud.controller;

import com.example.SecurityDB.Project.cloud.model.Role;
import com.example.SecurityDB.Project.cloud.model.User;
import com.example.SecurityDB.Project.cloud.service.UserService.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class AppController {

    /* Main Controller*/

    @Autowired
    private UserService service;

    @GetMapping("")
    public String viewHomePage(){
        return "index";
    }

    @GetMapping("/register")
    public String showSignUpForm(ModelMap model){
    model.addAttribute("user",new User());
    return "signup_form";
    }

    @PostMapping("/process_register")
    public String processRegistration(User user){
        service.saveUserWithDefaultRole(user);
        return "register_success";
    }

    @GetMapping("/list_users")
    public String viewUsersList(ModelMap model){
        List<User> listUsers = service.listAll();
        model.addAttribute("listUsers",listUsers);

        return "users";
    }
    @GetMapping("/view_admin_dashboard")
    public String viewadminMainPage(){
        return "admin_dashboard";
    }
    @GetMapping("/view_client_dashboard")
    public String viewclientMainPage(){
        return "client_dashboard";
    }
    @GetMapping("/view_waiter_dashboard")
    public String viewwaiterMainPage(){
        return "waiter_dashboard";
    }

    @GetMapping("/users/edit/{id}")
    public String editUser(@PathVariable("id") Long id, ModelMap model) {
        User user = service.get(id);
        List<Role> listRoles=service.getRoles();
        model.addAttribute("user",user);
        model.addAttribute("listRoles",listRoles);
        return "user_form";
    }
    @PostMapping("/users/save")
    public String saveUser(User user){
        service.save(user);

        return "redirect:/list_users";
    }

    @GetMapping("/users/delete/{id}")
    public String deleteUser(@PathVariable(value="id") long id){
        service.deleteUserById(id);
        return "redirect:/list_users";
    }

}