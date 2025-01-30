package com.home.primerProyecto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication //La asigna como la clase principal del proyecto
@RestController //Marcar uina clase como un controlador para trabjaar con metodos http
@RequestMapping("/principal")
public class PrimerProyectoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoApplication.class, args);	
	}	

	@GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {
    	return String.format("Hello %s esta rama sera para desarrollar pruebas", name);
    }

	@GetMapping("/registro")
    public String Mensaje(){
        return "Aqui estaran los bancos";
    }

    @GetMapping("/datos/{nombre}/{pais}")
    public String imprimirBanco(@PathVariable String nombre, @PathVariable String pais){
    return "Esta es la empresa "+nombre+" proveniente de: "+pais;
    }

    //Podemos realizar un endopoint con varias rutas validas
    @GetMapping({"/banco","/bank"})
    public String obtenerBanco() {
        return "Aqui tienes todos los bancos registrados";
    }

    @GetMapping({"/nombre/{name}","/name/{name}"})
    public String obtenerNombre(@PathVariable String name) {
        return "Aqui tienes al banco: "+ name;
    }


}
