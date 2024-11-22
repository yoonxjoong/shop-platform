package com.example.userservice.model.entity;

import com.example.userservice.dto.request.SignUpRequest;
import lombok.Builder;

@Builder
public class User {

    private int id;

    private String email;

    private String password;

    private String nickName;

    private String profileName;

    public static User ofSignUp(SignUpRequest request){
        return User.builder()
                .id(request.id())
                .email(request.email())
                .password(request.password())
                .nickName(request.nickName())
                .profileName(request.profileImage())
                .build();
    }
}
