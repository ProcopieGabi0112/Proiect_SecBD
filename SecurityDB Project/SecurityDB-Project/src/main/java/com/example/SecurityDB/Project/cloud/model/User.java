package com.example.SecurityDB.Project.cloud.model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Entity
@Table(name="users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false,unique = true,length=45)
    private String email;

    @Column(nullable = false,length = 64)
    private String password;

    @Column(nullable = false,length = 20)
    private String first_name;

    @Column(nullable = false,length = 20)
    private String last_name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="users_roles",joinColumns = @JoinColumn(name="user_id"),inverseJoinColumns = @JoinColumn(name="role_id"))
    private Set<Role> roles = new HashSet<>();

    public Set<Role> getRoles() { return roles; }
    public void setRoles(Set<Role> roles) { this.roles = roles;}

    public boolean hasRole(String roleName){
        Iterator<Role> iterator = roles.iterator();

        while(iterator.hasNext())
        {
            Role role = iterator.next();
            if(role.getName().equals(roleName)) { return true; }
        }
        return false;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setFirstName(String first_name) {
        this.first_name = first_name;
    }

    public void setLastName(String last_name) {
        this.last_name = last_name;
    }

    public Long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getFirstName() {
        return first_name;
    }

    public String getLastName() {
        return last_name;
    }

    public void addRole(Role role) {
        this.roles.add(role);
    }


}