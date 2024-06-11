package com.example.LogApp2.service;

import com.example.LogApp2.dtos.request.RegisterRequest;
import com.example.LogApp2.dtos.response.RegisterResponse;

public interface LogService {
    RegisterResponse register(RegisterRequest request);
}
