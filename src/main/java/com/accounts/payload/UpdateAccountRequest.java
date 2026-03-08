package com.accounts.payload;

import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class UpdateAccountRequest {


    private String firstName;
    private String secondName;
    private String thirdName;
    private String address;
    private int age;
    private LocalDate birthDate;
    private String gender;
    private String nationality;
    private String nationalId;
    private String email;
    private String phoneNumber;


}
