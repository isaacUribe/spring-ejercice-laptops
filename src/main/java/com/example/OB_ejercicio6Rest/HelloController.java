package com.example.OB_ejercicio6Rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${app.message}")
    String message;
    @GetMapping("/saludo")
    public String saludo(){
        System.out.println(message);
        return "Hola Mundo ha no ma si es cierto pinche gobiero puto!!";
    }

}
