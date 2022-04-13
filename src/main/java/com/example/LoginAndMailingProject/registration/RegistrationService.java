package com.example.LoginAndMailingProject.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationService {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    public String register(RegistrationRequest request) {
        return "Welcome! to registration.";
    }
}
