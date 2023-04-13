package com.study.usersystem;

import com.study.usersystem.dto.CreateUserRequest;
import com.study.usersystem.dto.CreateUserResponse;
import com.study.usersystem.dto.DeleteUserResponse;
import com.study.usersystem.dto.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RequestMapping("/api")
@RestController
public class UserController {

    private final UserService userService;

    /**
     * 사용자 생성
     */
    @PostMapping("/users")
    public CreateUserResponse createUser(@RequestBody CreateUserRequest createUserRequest) {
        return userService.createUser(createUserRequest);
    }

    /**
     * 사용자 단건 조회
     */
    @GetMapping("/users")
    public UserInfo getUser(@RequestParam("personalId") String personalId) {
        return userService.getUser(personalId);
    }

    /**
     * 사용자 삭제
     */
    @DeleteMapping("/users")
    public DeleteUserResponse deleteUser(@RequestParam("personalId") String personalId) {
        return userService.deleteUser(personalId);
    }
}