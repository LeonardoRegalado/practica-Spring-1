package com.home.primerProyecto.controllers;

import com.home.primerProyecto.services.PalindromoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //Decorardor de la clase 
@RequestMapping("/empresa")

//ESTA CLASE    ESTA HECHA PARA PODER RECONOCER PALINDROMOS APARTIR DE LAS VARIABLES OBTENIDAS
// DESDE LA RUTA
public class PalindromoController {

    @Autowired
    private PalindromoService palindromoService;

    @GetMapping("/palindromo/{palabra}")
    public String verificarPalindromo(@PathVariable String palabra) {
        if (palabra.equals( palindromoService.metodoInversor(palabra))) {
            return "<h1>La palabra "+palabra+" es un palindromo</h1>";
        }else{
            return "<h1>La palabra "+palabra+" NO es un palindromo</h1>";
        }    
    }
    
    



    @GetMapping("/palindrome/{palabra}")
    public String verificarPalindromo2(@PathVariable String palabra) {
        return palindromoService.metodoIndices(palabra);  
    }

   
    
}


