package com.example.demo.service;

import com.example.demo.model.CardDto;
import org.springframework.stereotype.Service;

@Service
public class CardService {


public CardDto createCart(CardDto cardDto){
    return new CardDto();
}

}
