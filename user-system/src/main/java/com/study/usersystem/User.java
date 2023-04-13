package com.study.usersystem;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String personalId;

    @Column
    private String password;

    @Column
    private String nickname;

    @Column
    private String description;

    public User(String personalId, String password, String nickname, String description) {
        this.personalId = personalId;
        this.password = password;
        this.nickname = nickname;
        this.description = description;
    }
}