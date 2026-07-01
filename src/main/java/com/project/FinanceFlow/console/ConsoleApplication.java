package com.project.financeflow.console;

import com.project.financeflow.business.UserService;
import com.project.financeflow.infrastructure.entities.User;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ConsoleApplication implements CommandLineRunner {

    private final UserService userService;


    @Override
    public void run(String... args) throws Exception {

        User user = User.builder()
                .email("teste@gmail.com")
                .name("Jonathan")
                .password("123")
                .build();
        userService.userRegister(user);

        System.out.println("Usuario criado com sucesso: " + user);

    }
}
