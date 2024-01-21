package com.springsecurity.eazybank.service;

import com.springsecurity.eazybank.model.Accounts;
import com.springsecurity.eazybank.repository.AccountsRepository;
import com.springsecurity.eazybank.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AccountsService {
    private final AccountsRepository accountsRepository;
    private final CustomerRepository customerRepository;

    public Accounts getAccountDetails(String email) {
        Long customerId= customerRepository.findIdByEmail(email);
        return accountsRepository.findByCustomerId(customerId);
    }
}
