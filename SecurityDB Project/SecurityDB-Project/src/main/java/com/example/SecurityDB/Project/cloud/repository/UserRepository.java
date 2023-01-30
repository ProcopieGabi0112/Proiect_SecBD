package com.example.SecurityDB.Project.cloud.repository;

import com.example.SecurityDB.Project.cloud.model.User;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

   @Query("SELECT u FROM User u WHERE u.email= ?1 ")
    User findByEmail(String email);

}
