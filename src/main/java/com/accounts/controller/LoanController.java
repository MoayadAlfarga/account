package com.accounts.controller;

import com.accounts.dto.LoanDto;
import com.accounts.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/loans")
public class LoanController {
    private final LoanService loanService;
    @GetMapping("loan/{loanNumber}")
    public ResponseEntity<LoanDto> getLoanByLoanNumber(@PathVariable Long loanNumber) {
        return ResponseEntity.ok(loanService.getLoanByLoanNumber(loanNumber));
    }

    @GetMapping("account/{accountNumber}")
    public ResponseEntity<LoanDto> getLoanByAccountNumber(@PathVariable Long accountNumber) {
        return ResponseEntity.ok(loanService.getLoanByAccountNumber(accountNumber));
    }
}
