package com.accounts.service;

import com.accounts.client.LoanClient;
import com.accounts.dto.LoanDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class LoanService {
    private final LoanClient loanClient;


    public LoanDto getLoanByAccountNumber(Long accountNumber) {
        return loanClient.getLoanByAccountNumber(accountNumber);
    }
    public LoanDto getLoanByLoanNumber(Long loanNumber) {
        return loanClient.getLoanByLoanNumber(loanNumber);
    }
}
