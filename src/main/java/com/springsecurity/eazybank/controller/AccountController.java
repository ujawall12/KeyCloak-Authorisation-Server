package com.springsecurity.eazybank.controller;

import com.springsecurity.eazybank.model.Accounts;
import com.springsecurity.eazybank.service.AccountsService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequiredArgsConstructor
public class AccountController {

    private final AccountsService accountsService;

    @GetMapping("/myAccount")
    public ResponseEntity<Accounts> getAccountDetails(@RequestParam String  email) {
        Accounts accounts = accountsService.getAccountDetails(email);
        if (Objects.isNull(accounts)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(accounts);
    }


}
