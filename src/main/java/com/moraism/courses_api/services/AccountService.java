package com.moraism.courses_api.services;

import com.moraism.courses_api.dto.AccountResponseDTO;
import com.moraism.courses_api.dto.CreateAccountRequestDTO;
import com.moraism.courses_api.model.Account;
import com.moraism.courses_api.repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public AccountResponseDTO create(CreateAccountRequestDTO createAccountRequestDTO) {
        Account account = new Account();
        account.setName(createAccountRequestDTO.name());
        account.setEmail(createAccountRequestDTO.email());
        account.setPassword(createAccountRequestDTO.password());

        account.setRole(createAccountRequestDTO.role());

        Account createdAccount = accountRepository.save(account);
        return new AccountResponseDTO(createdAccount.getId(), createdAccount.getName(), createdAccount.getEmail());
    }

}
