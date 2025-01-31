package com.home.primerProyecto.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController //Decorardor de la clase 
@RequestMapping("/empresa")

//ESTA CLASE ESTA HECHA PARA PODER RECONOCER PALINDROMOS APARTIR DE LAS VARIABLES OBTENIDAS
// DESDE LA RUTA
public class PalindromoController {

    //ESTE METODO INVIERTE LA PALABRA Y LA COMPARA CON LA ORIGINAL PARA SABER SI ES UN PALINDROMOS
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

// ESTE METODO UTILIZA DOS INDICES PARA PODER RECORRER LA PALABRA 
// DESDE EL INICIO Y UNA DESDE EL FINAL, COMPARANDO QUE LAS LETRAS EN AMBOS
// INDICES SEAN IGUALES Y ASI DECIDIR SI ES UN PALINDROMO
    @GetMapping("/palindrome/{palabra}")
    public String verificarPalindromo2(@PathVariable String palabra) {
        return verirficarPalabra(palabra);  
    }

    public  String verirficarPalabra(String palabra){
        
        char[] arrayPalabra = palabra.toCharArray();
        int index = palabra.length() /2 ;
        if (palabra.length() % 2 == 0) index ++; 
        for (int i = 0; i < index; i++) {
            if (arrayPalabra[i] != arrayPalabra[ palabra.length()-1-i]) {
                return "La palabra "+palabra+" NO es un palindromo";
            }
        }
        return "La palabra "+palabra+" es un palindromo";
    }
    
}


