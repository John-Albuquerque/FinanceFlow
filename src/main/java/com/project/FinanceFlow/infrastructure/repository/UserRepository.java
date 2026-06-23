package com.project.FinanceFlow.infrastructure.repository;


import com.project.FinanceFlow.infrastructure.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    void deleteByEmail(String email);
}
