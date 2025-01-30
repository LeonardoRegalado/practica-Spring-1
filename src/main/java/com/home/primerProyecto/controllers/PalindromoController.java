package com.home.primerProyecto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //Decorardor de la clase 
@RequestMapping("/empresa")

public class PalindromoController {


    @GetMapping("/palindromo/{palabra}")
    public String verificarPalindromo(@PathVariable String palabra) {
        if (palabra.equals(invertir(palabra))) {
            return "<h1>La palabra "+palabra+" es un palindromo</h1>";
        }else{
            return "<h1>La palabra "+palabra+" NO es un palindromo</h1>";
        }    
    }
    
    public String invertir(String cadena){
        char[] cadenaInvertida = new char[cadena.length()];
        char[] arrayCadena = cadena.toCharArray();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida[cadena.length()-i-1] = arrayCadena[i];
        }   
        return new String(cadenaInvertida) ;
    }
    
    
}


