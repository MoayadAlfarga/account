package com.accounts.repository;

import com.accounts.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository <Account, Long>{
    Account findByEmail(String email);
    Account findByPhoneNumber(String phoneNumber);
    Optional<Account> findByAccountNumber(Long accountNumber);
   Optional<Account>  findByNationalId(String nationalId);
}
