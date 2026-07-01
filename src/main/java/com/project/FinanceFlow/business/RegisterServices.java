package com.project.financeflow.business;

import com.project.financeflow.dtos.requests.UserCreationRequest;
import com.project.financeflow.dtos.responses.UserCreatedResponse;
import com.project.financeflow.infrastructure.entities.User;
import com.project.financeflow.infrastructure.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RegisterServices {
    private static final String MENSAGEM_SUCESSO_CRIACAO_USUARIO = "Usuário criado com sucesso!";
    private final UserRepository userRepository;


    public UserCreatedResponse registerUser(UserCreationRequest request){
        if(userRepository.existsByEmail(request.getEmail())){
            throw new RuntimeException("Email já cadastrado");
        }
        User user = User.builder()
                .name(request.getName())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

        userRepository.save(user);

        return UserCreatedResponse
                .builder()
                .id(user.getId())
                .name(user.getName())
                .mensage(MENSAGEM_SUCESSO_CRIACAO_USUARIO)
                .build();

    }
}
