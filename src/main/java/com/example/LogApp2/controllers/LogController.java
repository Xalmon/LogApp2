package com.example.LogApp2.controllers;

import com.example.LogApp2.dtos.request.RegisterRequest;
import com.example.LogApp2.dtos.response.RegisterResponse;
import com.example.LogApp2.service.LogService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
public class LogController {
    private LogService logService;

    @PostMapping("/register")
    public ResponseEntity<RegisterResponse> register(@RequestBody RegisterRequest request) {
        return new ResponseEntity<>(logService.register(request), HttpStatus.OK);
    }
}
