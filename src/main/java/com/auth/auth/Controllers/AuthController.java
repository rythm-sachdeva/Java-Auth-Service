package com.auth.auth.Controllers;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auth.auth.Dto.PassengerDto;
import com.auth.auth.Dto.PassengerSignUpRequestDto;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api/v1/auth")
public class AuthController{
 
    @PostMapping("signup")
    public ResponseEntity<?> signUp(@RequestBody PassengerSignUpRequestDto request){
        PassengerDto passenger = new PassengerDto().builder()
            .name(request.getName())
            .email(request.getEmail())
            .PhoneNumber(request.getPhoneNumber())
            .Password(request.getPassword())
            .build();
            System.out.println(passenger);
        return null;
    }
    
    

}