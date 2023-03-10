package com.olegpash.web_lab4.service;


import com.olegpash.web_lab4.dto.JwtResponseDTO;
import com.olegpash.web_lab4.dto.UserCredentialsDTO;

public interface AuthService {

    void registerUser(UserCredentialsDTO userCredentialsDTO);

    JwtResponseDTO loginUser(UserCredentialsDTO userCredentialsDTO);

    JwtResponseDTO refreshUser(String refreshToken);
}
