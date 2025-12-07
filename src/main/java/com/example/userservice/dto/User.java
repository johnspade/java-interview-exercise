package com.example.userservice.dto;

public record User(
    Long id,
    String name,
    String username,
    String email
) {}
