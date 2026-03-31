package com.accounts.client;

import com.accounts.dto.LoanDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "", url = "")
public interface LoanClient {
    @GetMapping("")
    LoanDto getLoanById(@PathVariable Long id);
    @GetMapping("")
    LoanDto getLoanByAccountId(@PathVariable Long accountNumber);
}
