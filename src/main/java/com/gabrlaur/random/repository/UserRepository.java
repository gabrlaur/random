package com.gabrlaur.random.repository;

import com.gabrlaur.random.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
