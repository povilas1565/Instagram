package com.example.instacat.repository;

import com.example.instacat.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findUsersByUsername(String username);

    Optional<User> findUserByEmail(String email);

    Optional<User> findUsersById(Long id);
}
