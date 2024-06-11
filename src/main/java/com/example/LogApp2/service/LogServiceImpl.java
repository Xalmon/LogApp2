package com.example.LogApp2.service;

import com.example.LogApp2.dtos.request.RegisterRequest;
import com.example.LogApp2.dtos.response.RegisterResponse;
import com.example.LogApp2.model.Log;
import com.example.LogApp2.repository.LogRepository;
import org.springframework.stereotype.Service;

@Service
public class LogServiceImpl implements LogService {
    private LogRepository logRepository;

    @Override
    public RegisterResponse register(RegisterRequest registerRequest) {
        Log log = new Log();
        log.setPassword(registerRequest.getPassword());
        log.setUsername(registerRequest.getUsername());

        logRepository.save(log);
        RegisterResponse response = new RegisterResponse();
        response.setMessage("Registration successful");
        return response;
    }
}
