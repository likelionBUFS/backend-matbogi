package com.study.usersystem.dto;

import com.study.usersystem.User;

public record UserInfo(
        String message,
        String personalId,
        String nickName,
        String description
) {

    public static UserInfo of(User user) {
        return new UserInfo(
                "정상적으로 사용자가 조회되었습니다.",
                user.getPersonalId(),
                user.getNickname(),
                user.getDescription()
        );
    }

    public static UserInfo of() {
        return new UserInfo(
                "존재하지 않는 사용자입니다.",
                "NO-USER",
                "NO-USER",
                "NO-USER"
        );
    }
}