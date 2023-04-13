package com.study.usersystem.dto;

public record CreateUserRequest(
        String personalId,
        String password,
        String nickname,
        String description
) {}