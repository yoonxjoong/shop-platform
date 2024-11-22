package com.example.userservice.controller;

import com.example.userservice.dto.request.SignUpRequest;
import com.example.userservice.dto.response.ApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1.0/user")
public class UserController {

    @PostMapping("/sign-up")
    public ApiResponse<SignUpRequest> signUp(@RequestBody SignUpRequest request){
        return new ApiResponse<>(request, "success", HttpStatus.OK.value());
    }
}
