package com.sandesh.banking.mapper;

import com.sandesh.banking.Dto.AccountDto;
import com.sandesh.banking.entity.Account;

public class AccountMapper {

    public static Account mapToAccount(AccountDto accountDto) {
        Account account = new Account(
                accountDto.getId(),
                accountDto.getAccountHolderName(),
                accountDto.getBalance()
        );

        return account;
    }

    public static AccountDto mapTOAccountDto(Account account) {
        AccountDto accountDto = new AccountDto(
                account.getId(),
                account.getAccountHolderName(),
                account.getBalance());
        return accountDto;
    }
}
