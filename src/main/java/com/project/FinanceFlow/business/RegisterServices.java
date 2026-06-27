package com.project.financeflow.business;

import com.project.financeflow.infrastructure.entities.User;
import com.project.financeflow.infrastructure.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class RegisterServices {

    private final UserRepository repository;


    public void registerUser(String name, String email, String senha){
        User user = User.builder()
                .name(name)
                .email(email)
                .password(senha)
                .build();

        repository.save(user);
        System.out.println(user);
    }
}
