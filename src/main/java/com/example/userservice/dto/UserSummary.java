package com.example.userservice.dto;

import java.util.List;

public record UserSummary(
    Long id,
    String name,
    String email,
    int postCount,
    List<String> postTitles
) {}
