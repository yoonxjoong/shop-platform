package com.example.userservice.dto.request;

public record SignUpRequest(int id, String email, String password, String nickName,
                            String profileImage) {

}
