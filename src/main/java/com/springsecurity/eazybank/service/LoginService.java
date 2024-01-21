package com.springsecurity.eazybank.service;

import com.springsecurity.eazybank.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final CustomerRepository customerRepository;

    public boolean checkIfUserExist(String email) {
        return customerRepository.existsByEmail(email);
    }
}
