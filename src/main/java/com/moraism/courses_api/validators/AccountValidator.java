package com.moraism.courses_api.validators;

import com.moraism.courses_api.exceptions.UserAlreadyExistsException;
import com.moraism.courses_api.model.Account;
import com.moraism.courses_api.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountValidator {

    @Autowired
    private AccountRepository accountRepository;

    public void validateNewAccount(Account account) {
        accountRepository.findByEmail(account.getEmail()).orElseThrow(() -> {
            throw new UserAlreadyExistsException("Email já existente");
        });
    }

}
