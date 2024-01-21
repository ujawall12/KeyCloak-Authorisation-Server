package com.springsecurity.eazybank.service;

import com.springsecurity.eazybank.model.Cards;
import com.springsecurity.eazybank.repository.CardRepository;
import com.springsecurity.eazybank.repository.CustomerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CardsService {

    private final CardRepository cardRepository;
    private final CustomerRepository customerRepository;

    public List<Cards> getCardsDetails(String email) {
        Long customerId = customerRepository.findIdByEmail(email);
        return cardRepository.findAllByCustomerId(customerId);
    }

}
