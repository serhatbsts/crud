package com.example.demo.controller;

import com.example.demo.model.Card;
import com.example.demo.model.CardDto;
import com.example.demo.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/cards")
public class CardController {

    @Autowired
    CardService cardService;


    @PostMapping
    public CardDto saveCard(@RequestBody CardDto card){
        System.out.println(card);
        System.out.println("kjfskjdfskjdfsjkdf");
        return cardService.createCart(card);
    }
}
