package com.project.FinanceFlow.console;

import com.project.FinanceFlow.business.UserService;
import com.project.FinanceFlow.infrastructure.entitys.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ConsoleApplication implements CommandLineRunner {

    private final UserService userService;

    public ConsoleApplication(UserService userService) {
        this.userService = userService;
    }

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
