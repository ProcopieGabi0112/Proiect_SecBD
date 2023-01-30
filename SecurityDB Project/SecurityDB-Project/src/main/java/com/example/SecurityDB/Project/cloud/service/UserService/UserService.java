package com.example.SecurityDB.Project.cloud.service.UserService;

import com.example.SecurityDB.Project.cloud.model.Role;
import com.example.SecurityDB.Project.cloud.model.User;
import com.example.SecurityDB.Project.cloud.repository.RoleRepository;
import com.example.SecurityDB.Project.cloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepo;

    @Autowired
    private RoleRepository roleRepo;

    public void saveUserWithDefaultRole(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        Role roleUser = roleRepo.findByName("Client");
        user.addRole(roleUser);

        userRepo.save(user);
    }
    public List<User> listAll() {
        return userRepo.findAll();
    }

    public User get(Long id){
        return userRepo.findById(id).get();
    }

    public List<Role> getRoles(){
        return roleRepo.findAll();
    }

    public void save(User user){
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String encodedPassword = encoder.encode(user.getPassword());
        user.setPassword(encodedPassword);
        userRepo.save(user);
    }
     public void deleteUserById(long id){
        userRepo.deleteById(id);
        /*roleRepo.deleteById(id);*/
     }

}
