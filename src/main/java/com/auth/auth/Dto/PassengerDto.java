package com.auth.auth.Dto;
import java.util.Date;

import lombok.*;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor 
public class PassengerDto {
    private Long id;
    private String name;
    private String email;
    private String PhoneNumber;
    private String Password;
    private Date createdAt;

}
