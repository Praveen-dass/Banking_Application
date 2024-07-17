package com.bank.application.mapper;

import com.bank.application.Entity.Account;
import com.bank.application.dto.AccountDto;

public class AccountMapper {

    // accountdto -> accountjpaentity
    public static Account maptoAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance());
        return account;
    }

    // accountjpaentity->accountdto

    public static AccountDto mapToAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance());
        return accountDto;
    }
}
