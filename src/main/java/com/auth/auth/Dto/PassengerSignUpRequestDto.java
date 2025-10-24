package com.auth.auth.Dto;
import lombok.*;



@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignUpRequestDto {
    private String Name;
    private String Email;
    private String PhoneNumber;
    private String Password;
}
