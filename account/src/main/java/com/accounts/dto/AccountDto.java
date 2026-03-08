package com.accounts.dto;

import com.accounts.entity.Account;
import com.accounts.enums.AccountStatusEnums;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class AccountDto {
    private String firstName;
    private String secondName;
    private String thirdName;
    private String email;
    private String phoneNumber;
    private String address;
    private int age;
    private String gender;
    private String nationality;
    private String nationalId;
    private long accountNumber;
//    private AccountStatusEnums accountStatusEnums;
    private String  accountStatus;

    public static AccountDto fromEntity(Account account) {
        return AccountDto.builder()
                .firstName(account.getFirstName())
                .secondName(account.getSecondName())
                .thirdName(account.getThirdName())
                .email(account.getEmail())
                .phoneNumber(account.getPhoneNumber())
                .address(account.getAddress())
                .age(account.getAge())
                .gender(account.getGender())
                .nationality(account.getNationality())
                .nationalId(account.getNationalId())
//                .accountStatusEnums(account.getStatus().getStatus())
                .accountNumber(account.getAccountNumber())
                .build();
    }

}


