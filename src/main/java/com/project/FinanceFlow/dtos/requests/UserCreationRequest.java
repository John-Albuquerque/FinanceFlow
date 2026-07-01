package com.project.financeflow.dtos.requests;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreationRequest {
    @NotBlank(message = "O email é obrigatório")
    private String email;

    @NotBlank(message = "O nome é obrigatório")
    private String name;

    @NotBlank(message = "A senha é obrigatória")
    private String password;
}
