package com.project.financeflow.business;

import com.project.financeflow.infrastructure.entities.User;
import com.project.financeflow.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@AllArgsConstructor
public class LoginService {

    private final UserRepository repository;

    public boolean login(String email, String password){
        User user = repository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado"));
        return user != null && user.getPassword().equals(password);
    }
}
