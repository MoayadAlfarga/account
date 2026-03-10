//package com.accounts.controller;
//
//
//import com.accounts.dto.AccountDto;
//import com.accounts.entity.Account;
//import com.accounts.service.AccountService;
//import com.fasterxml.jackson.databind.ObjectMapper;
//import lombok.AllArgsConstructor;
//import org.junit.jupiter.api.BeforeEach;
//import org.mockito.ArgumentMatcher;
//import org.mockito.ArgumentMatchers;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.web.servlet.MockMvc;
//import org.springframework.test.context.bean.override.mockito.MockitoBean;
//
//import static org.awaitility.Awaitility.given;
//
//@WebMvcTest(controllers = AccountController.class)
//@AutoConfigureMockMvc(addFilters = false)
//@AllArgsConstructor
//public class AccountControllerTest {
//
//    private MockMvc mockMvc;
//    private ObjectMapper objectMapper;
//    @MockitoBean
//    private AccountService accountService;
//
//    private Account account;
//    private AccountDto accountDto;
//
//    @BeforeEach
//    public void init() {
//        account = Account.builder()
//                .firstName("John")
//                .secondName("Doe")
//                .email("john.doe@example.com")
//                .phoneNumber("1234567890")
//                .accountNumber(123456789L)
//                .build();
//        accountDto = AccountDto.builder()
//                .firstName("John")
//                .secondName("Doe")
//                .email("john.doe@example.com")
//                .phoneNumber("1234567890")
//                .accountNumber(123456789L)
//                .build();
//    }
//}
//
