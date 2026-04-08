package com.accounts.dto;

import lombok.*;

import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class LoanDto {
    private Long id;
    private Long accountNumber;
    private String loanType;
    private String loanStatus;
    private BigDecimal principalAmount;
    private BigDecimal interestRate;
    private Integer loanTermInMonths;
    private BigDecimal outstandingBalance;
    private String firstNameBeneficiary;
    private String secondNameBeneficiary;
    private String lastNameBeneficiary;
    private String emailBeneficiary;
    private Long loanNumber;
}
