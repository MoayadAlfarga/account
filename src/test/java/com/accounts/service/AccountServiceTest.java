package com.accounts.service;

import com.accounts.dto.AccountDto;
import com.accounts.entity.Account;
import com.accounts.exception.AccountAlreadyExistsException;
import com.accounts.exception.ResourceNotFoundException;
import com.accounts.payload.CreateAccountRequest;
import com.accounts.payload.UpdateAccountRequest;
import com.accounts.repository.AccountRepository;
import com.accounts.repository.AccountStatusRepository;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class AccountServiceTest {
//
//    @Mock
//    private AccountRepository accountRepository;
//    @InjectMocks
//    private AccountService accountService;
//
//
//    public CreateAccountRequest fillRequestCreateNewAccount() {
//        return CreateAccountRequest.builder().firstName("moayad")
//                .secondName("Doe").thirdName("Smith")
//                .address("123 Main St")
//                .age(30)
//                .birthDate(LocalDate.of(1994, 1, 1))
//                .gender("Male")
//                .nationality("American")
//                .nationalId("1237678555639")
//                .email("john.doe@eddxxample.com")
//                .phoneNumber("1234567890")
//                .build();
//    }
//
//    @Test
//    void Create_Success_Account_Return_AccountDto() {
//        // Arrange
//        CreateAccountRequest newRequest = fillRequestCreateNewAccount();
//        Assertions.assertNotNull(newRequest);
//        when(accountRepository.findByNationalId(newRequest.getNationalId())).thenReturn(Optional.empty());
//        when(accountRepository.save(any(Account.class))).thenAnswer(invocation -> invocation.getArgument(0));
//
//        // Act
//        AccountDto accountDto = accountService.createAccount(newRequest);
//
//        // Assert
//        log.info("Request: {}", newRequest);
//        log.info("AccountDto: {}", accountDto);
//        Assertions.assertNotNull(accountDto);
//        assertEquals(newRequest.getNationalId(), accountDto.getNationalId());
//    }
//
//    @Test
//    void createAccount_ThrowsAccountAlreadyExistsException() {
//        // Arrange
//        CreateAccountRequest newRequest = fillRequestCreateNewAccount();
//        when(accountRepository.findByNationalId(newRequest.getNationalId())).thenReturn(Optional.of(new Account()));
//
//        // Act & Assert
//        assertThrows(AccountAlreadyExistsException.class, () -> accountService.createAccount(newRequest));
//    }
//
//    @Test
//    void getAccountByAccountNumber_Success() {
//        // Arrange
//        Long accountNumber = 1234567890L;
//        Account account = Account.builder().accountNumber(accountNumber).firstName("moayad").build();
//        when(accountRepository.findByAccountNumber(accountNumber)).thenReturn(Optional.of(account));
//
//        // Act
//        AccountDto result = accountService.getAccountByAccountNumber(accountNumber);
//
//        // Assert
//        assertNotNull(result);
//        assertEquals(accountNumber, result.getAccountNumber());
//    }
//
//        @Test
//        public void test_Loan_direct() {
//            CreateAccountRequest newRequest = fillRequestCreateNewAccount();
//            AccountDto accountDto = accountService.createAccount(newRequest);
//            log.info("AccountDto: {}", accountDto);
//
//        }
//
//    @Test
//    void getAccountByAccountNumber_ThrowsResourceNotFoundException() {
//        // Arrange
//        Long accountNumber = 1234567890L;
//        when(accountRepository.findByAccountNumber(accountNumber)).thenReturn(Optional.empty());
//
//        // Act & Assert
//        assertThrows(ResourceNotFoundException.class, () -> accountService.getAccountByAccountNumber(accountNumber));
//    }
//
//    @Test
//    public void Get_All_Accounts_Success_Return_List_AccountDto() {
//        // Arrange
//        when(accountRepository.findAll()).thenReturn(java.util.List.of(Account.builder().build()));
//
//        // Act & Assert
//        Assertions.assertNotNull(accountService.getAllAccounts());
//    }

}
