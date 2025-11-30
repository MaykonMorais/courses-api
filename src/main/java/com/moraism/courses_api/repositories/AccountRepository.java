package com.moraism.courses_api.repositories;

import com.moraism.courses_api.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;
import java.util.UUID;

public interface AccountRepository extends JpaRepository<Account, UUID> {
    public Optional<Account> findByEmail(String email);
}
