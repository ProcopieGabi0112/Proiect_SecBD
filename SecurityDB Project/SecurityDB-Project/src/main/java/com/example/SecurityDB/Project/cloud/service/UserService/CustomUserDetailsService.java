package com.example.SecurityDB.Project.cloud.service.UserService;


import com.example.SecurityDB.Project.cloud.model.User;
import com.example.SecurityDB.Project.cloud.repository.UserRepository;
import com.example.SecurityDB.Project.cloud.security.CustomUserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository repo;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException
    {
        User user=repo.findByEmail(email);
        if(user ==null)
            throw new UsernameNotFoundException("User not found");
        return new CustomUserDetails(user);
    }
}
