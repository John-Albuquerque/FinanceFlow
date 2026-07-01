package com.project.financeflow.business;

import com.project.financeflow.infrastructure.entities.User;
import com.project.financeflow.infrastructure.repositories.UserRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void userRegister(User user) {
        userRepository.save(user);
    }
    public User findByEmail(String email){
        return userRepository.findByEmail(email).orElseThrow(
                () -> new RuntimeException("Email não encontrado")
        );
    }
    @Transactional
    public void userDelete (String email){
        userRepository.deleteByEmail(email);
    }

    public void userUpdateByEmail(String email, User user){
        User userEntity = findByEmail(email);
        User userUpdated = User.builder()
                .email(email)
                .name(user.getName() != null ? user.getName() : userEntity.getName())
                .password(user.getPassword() != null ? user.getPassword() : userEntity.getPassword())
                .id(userEntity.getId())
                .build();
        userRepository.save(userUpdated);
    }

}
