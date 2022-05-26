package com.example.helloworldGeneration.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hello")
public class HelloworldController {

    @GetMapping
    public String hello(){
        return "HelloWorld \n Iniciamos SPRING na Generation!!!";
    }

    @GetMapping("/Conceitos")
    public String BSM(){
        return "BSMs da Gen !!!\nMentalidade de Crescimento" +
                "\nResponsabilidade Pessoal" +
                "\nOrientação ao Futuro" +
                "\nProatividade" +
                "\nTrabalho em Equipe" +
                "\nComunicação" +
                "\nMentalidade de Crescimento" +
                "\nPersistencia" +
                "\nOrientação ao Detalhe";
    }

    @GetMapping("/Devjr")
    public String DEVJR(){
        return "Aprender melhor sobre o SPRING e Conceitos Rest";
    }

}
