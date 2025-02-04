package com.lochan.Carban.Cell.repository;


import com.lochan.Carban.Cell.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepo extends JpaRepository<User, Integer> {

    Optional<User> findByEmail(String email);
}
