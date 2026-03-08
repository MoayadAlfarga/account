package com.accounts.service;

import com.accounts.dto.AccountDto;
import com.accounts.entity.Account;
import com.accounts.entity.AccountStatus;
import com.accounts.enums.AccountStatusEnums;
import com.accounts.enums.AccountType;
import com.accounts.exception.AccountAlreadyExistsException;
import com.accounts.exception.ResourceNotFoundException;
import com.accounts.payload.CreateAccountRequest;
import com.accounts.payload.UpdateAccountRequest;
import com.accounts.repository.AccountRepository;
import com.accounts.repository.AccountStatusRepository;
import jakarta.annotation.Nonnull;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
@RequiredArgsConstructor
@Slf4j
public class AccountService {

    private final AccountRepository accountRepository;
    private final AccountStatusRepository accountStatusRepository;

    @Transactional
    public AccountDto createAccount(CreateAccountRequest request) {
        log.info("Creating Account for nationalId: {}", request.getNationalId());
        accountRepository.findByNationalId(request.getNationalId()).ifPresent(account -> {
            throw new AccountAlreadyExistsException("Account", "nationalId", request.getNationalId());
        });
        Account account = buildCreateAccountInformation(request);
        AccountStatus accountStatus = fillStatusAccount(account);
        account.setStatus(accountStatus);
        Account savedAccount = saveAccount(account);
        return AccountDto.fromEntity(savedAccount);
    }

    private Account saveAccount(Account account) {
        return accountRepository.save(account);
    }

    @Transactional
    public AccountDto updateAccountInformation(Long id, UpdateAccountRequest request) {
        Account account = findById(id);
        fillUpdateInformation(account, request,null);
        Account savedAccount = saveAccount(account);
        return AccountDto.fromEntity(savedAccount);
    }

    public AccountDto getAccountByAccountNumber(Long accountNumber) {
        return AccountDto.fromEntity(findAccountByAccountNumber(accountNumber));
    }

    private void fillUpdateInformation(Account account, UpdateAccountRequest request,AccountStatus accountStatus) {
        if (request == null) {
            return;
        }
        Optional.ofNullable(request.getFirstName()).ifPresent(account::setFirstName);
        Optional.ofNullable(request.getSecondName()).ifPresent(account::setSecondName);
        Optional.ofNullable(request.getThirdName()).ifPresent(account::setThirdName);
        Optional.ofNullable(request.getEmail()).ifPresent(account::setEmail);
        Optional.ofNullable(request.getPhoneNumber()).ifPresent(account::setPhoneNumber);
        Optional.ofNullable(request.getAddress()).ifPresent(account::setAddress);
        Optional.ofNullable(request.getGender()).ifPresent(account::setGender);
        Optional.ofNullable(request.getNationality()).ifPresent(account::setNationality);
        Optional.ofNullable(request.getNationalId()).ifPresent(account::setNationalId);
        Optional.ofNullable(request.getBirthDate()).ifPresent(account::setBirthDate);
    }

    private Account buildCreateAccountInformation(CreateAccountRequest request) {
        return Account.builder()
                .firstName(request.getFirstName())
                .secondName(request.getSecondName())
                .thirdName(request.getThirdName())
                .email(request.getEmail())
                .phoneNumber(request.getPhoneNumber())
                .address(request.getAddress())
                .age(request.getAge())
                .gender(request.getGender())
                .birthDate(request.getBirthDate())
                .nationality(request.getNationality())
                .nationalId(request.getNationalId())
                .accountNumber(generateAccountNumber())
                .accountType(AccountType.SAVINGS)
                .build();
    }

    private Long generateAccountNumber() {
        long randomLoanNumber = 100000000000L + new Random().nextInt(900000000);
        log.info("created Account Number {}", randomLoanNumber);
        return randomLoanNumber;
    }

    public AccountDto getAccountById(Long id) {
        return AccountDto.fromEntity(findById(id));
    }

    public List<AccountDto> getAllAccounts() {
        return accountRepository.findAll()
                .stream().
                map(AccountDto::fromEntity)
                .toList();
    }

    private Account findById(Long id) {
        return accountRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Account", "id", id.toString()));
    }

    private Account findAccountByAccountNumber(Long accountNumber) {
        return accountRepository.findByAccountNumber(accountNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Account", "accountNumber", accountNumber.toString()));
    }

    private AccountStatus findAccountStatusById(Long id) {
        return accountStatusRepository.findById(id)
                .orElse(null);
    }


    private AccountStatus fillStatusAccount(Account account) {
        return AccountStatus.builder()
                .status(AccountStatusEnums.ACTIVE)
                .account(account)
                .build();
    }
}
