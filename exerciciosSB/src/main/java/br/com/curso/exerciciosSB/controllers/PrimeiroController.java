package br.com.curso.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping(path = "/",method = RequestMethod.GET)
    public String ola() {
        return "Ola Springboot!";
    }
	
	
}
