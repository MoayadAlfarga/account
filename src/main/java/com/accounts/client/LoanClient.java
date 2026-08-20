package com.accounts.client;

import com.accounts.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//http://localhost:8091/loan-service/api/loans
@FeignClient(
        name = "loans",
        url = "${url.loans.service}")
public interface LoanClient {
    @GetMapping("/account-number/{accountNumber}")
    LoanDto getLoanByAccountNumber(@PathVariable("accountNumber") Long accountNumber);

    @GetMapping("/number/{loanNumber}")
    LoanDto getLoanByLoanNumber(@PathVariable("loanNumber") Long loanNumber);

}
