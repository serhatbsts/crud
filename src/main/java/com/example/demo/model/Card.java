package com.example.demo.model;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="CARD_SERHAT")
public class Card implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "PHONE_NUMBER")
    private int phone;
    @Column(name = "emaıl")
    private String emaıl;
    @Column(name = "address")
    private String address;

}
