package com.cognizant.springrestjwt.controller;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.springrestjwt.dto.JwtResponseDTO;
import com.cognizant.springrestjwt.util.Jwtutil;

@RestController
public class AuthenticationController {

    private Jwtutil jwtUtil = new Jwtutil();

    @GetMapping("/authenticate")
    public JwtResponseDTO authenticate(
            @RequestHeader("Authorization") String authHeader) {

        String base64Credentials = authHeader.substring(6);

        byte[] decodedBytes =
                Base64.getDecoder().decode(base64Credentials);

        String credentials =
                new String(decodedBytes, StandardCharsets.UTF_8);

        String[] values = credentials.split(":");

        String username = values[0];

        String token = jwtUtil.generateToken(username);

        return new JwtResponseDTO(token);
    }
}