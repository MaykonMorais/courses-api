package com.moraism.courses_api.controllers;

import com.moraism.courses_api.dto.AccountResponseDTO;
import com.moraism.courses_api.dto.CreateAccountRequestDTO;
import com.moraism.courses_api.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @PostMapping
    public ResponseEntity<AccountResponseDTO> create(@RequestBody CreateAccountRequestDTO createAccountRequestDTO) {
        AccountResponseDTO accountResponseDTO = accountService.create(createAccountRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(accountResponseDTO);
    }

}
