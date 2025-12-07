package com.example.userservice.dto;

public record Post(
    Long id,
    Long userId,
    String title,
    String body
) {}
