package com.accounts.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
public class CardDto {
    private String cardType;
    private String cardStatus;
    private Long cardNumber;
    private Long accountNumber;
    private String mobileNumber;
    private String cardHolderName;
}
