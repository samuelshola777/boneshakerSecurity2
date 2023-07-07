package com.example.boneshakerSecurity2;

import com.example.boneshakerSecurity2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User,Long> {

    @Override
    Optional<User> findByEmail(String email);
}
