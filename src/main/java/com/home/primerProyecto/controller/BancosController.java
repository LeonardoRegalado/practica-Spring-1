package com.home.primerProyecto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/empresa")
public class BancosController {

    @GetMapping("/banco")
    public String Mensaje(){
        return "Aqui estaran los bancos";
    }

    @GetMapping("/datos/{nombre}/{pais}")
    public String imprimirBanco(@PathVariable String nombre, @PathVariable String pais){
    return "Esta es la empresa "+nombre+" proveniente de: "+pais;
    }
}


