package com.study.usersystem;

import com.study.usersystem.dto.CreateUserRequest;
import com.study.usersystem.dto.CreateUserResponse;
import com.study.usersystem.dto.DeleteUserResponse;
import com.study.usersystem.dto.UserInfo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;

    /**
     * 사용자 단건 조회
     */
    public UserInfo getUser(String personalId) {
        User user = userRepository.findByPersonalId(personalId);

        if (user != null) {
            return UserInfo.of(user);
        } else {
            return UserInfo.of();
        }
    }

    /**
     * 사용자 생성
     */
    public CreateUserResponse createUser(CreateUserRequest createUserRequest) {
        User user = userRepository.save(new User(
                createUserRequest.personalId(),
                createUserRequest.password(),
                createUserRequest.nickname(),
                createUserRequest.description()));

        return CreateUserResponse.of(user.getPersonalId());
    }

    /**
     * 사용자 삭제
     */
    public DeleteUserResponse deleteUser(String personalId) {
        User user = userRepository.findByPersonalId(personalId);
        userRepository.delete(user);

        return DeleteUserResponse.of(user.getPersonalId());
    }
}