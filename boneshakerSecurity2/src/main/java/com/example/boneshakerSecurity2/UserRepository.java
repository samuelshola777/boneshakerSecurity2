package com.example.boneshakerSecurity2;

import com.example.boneshakerSecurity2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
