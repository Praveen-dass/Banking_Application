package com.bank.application.Service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.bank.application.dto.AccountDto;

@Service
public interface AccountService {
    AccountDto createAccount(AccountDto accountDto);

    AccountDto getAccountById(Long id);

    AccountDto deposit(Long id, double amount);

    AccountDto withdraw(Long id, double amount);

    List<AccountDto> getAllAccounts();

    void deleteAccount(Long id);
}
