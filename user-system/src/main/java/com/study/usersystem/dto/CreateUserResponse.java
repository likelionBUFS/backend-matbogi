package com.study.usersystem.dto;

public record CreateUserResponse(
        String message,
        String personalId
) {

    public static CreateUserResponse of(String personalId) {
        return new CreateUserResponse("정상적으로 사용자가 생성되었습니다.", personalId);
    }
}