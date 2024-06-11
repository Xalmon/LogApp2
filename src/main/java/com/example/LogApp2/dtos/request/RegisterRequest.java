package com.example.LogApp2.dtos.request;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class RegisterRequest {
    private String username;
    private String password;
}
