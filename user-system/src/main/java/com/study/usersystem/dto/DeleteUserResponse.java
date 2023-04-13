package com.study.usersystem.dto;

public record DeleteUserResponse(
        String message,
        String personalId
) {

    public static DeleteUserResponse of(String personalId) {
        return new DeleteUserResponse(
                "정상적으로 사용자가 삭제되었습니다.",
                personalId
        );
    }
}