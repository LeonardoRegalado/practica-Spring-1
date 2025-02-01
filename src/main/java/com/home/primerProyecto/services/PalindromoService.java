package com.home.primerProyecto.services;

import org.springframework.stereotype.Service;

@Service
public class PalindromoService {
    

    public String metodoInversor(String palabra){
        return invertir(palabra);
    }

    public String metodoIndices(String palabra){
        return verirficarPalabra(palabra);
    }

/**
 *  ESTE METODO UTILIZA DOS INDICES PARA PODER RECORRER LA PALABRA
    *DESDE EL INICIO Y UNA DESDE EL FINAL, COMPARANDO QUE LAS LETRAS EN AMBOS 
    *INDICES SEAN IGUALES Y ASI DECIDIR SI ES UN PALINDROMO 
    * @param palabra La palabra a verificar
    * @return un mensaje indicando si la palabra es palindromo o no
 */

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



    /**
     * ESTE METODO INVIERTE LA PALABRA Y LA COMPARA CON LA ORIGINAL PARA SABER SI ES UN PALINDROMOS
     * @param cadena La palabra a verificar
     * @return un mensaje indicando si la palabra es palindromo o no
     */

    public String invertir(String cadena){
        char[] cadenaInvertida = new char[cadena.length()];
        char[] arrayCadena = cadena.toCharArray();

        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida[cadena.length()-i-1] = arrayCadena[i];
        }   
        return new String(cadenaInvertida) ;
    }
}
