package com.example.userservice.dto.response;

public record ApiResponse<T>(T data, String message, int status){}
