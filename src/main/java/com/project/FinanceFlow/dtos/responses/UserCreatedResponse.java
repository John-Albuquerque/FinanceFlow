package com.project.financeflow.dtos.responses;

import lombok.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserCreatedResponse {
    private Long id;
    private String name;
    private String mensage;
}
