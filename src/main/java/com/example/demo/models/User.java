package com.example.demo.models;

import jakarta.persistence.Entity;
import lombok.*;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
@Builder
public class User {
    private String userId;
    private String email;
    private String name;
}
