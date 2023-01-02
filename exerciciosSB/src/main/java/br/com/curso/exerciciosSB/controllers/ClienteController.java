package br.com.curso.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.exerciciosSB.model.entities.Cliente;

@RestController
@RequestMapping(path = "/clientes")//sempre que acessar o /clientes, usa essa classe
public class ClienteController {

	@GetMapping(path = "/qualquer")
	public Cliente obterCliente() {
		return new Cliente(28,"Pedro","123.456.789-00");
	}
	
	@GetMapping(path = "{id}")//o id q vc colocar vai gerar o cliente
	public Cliente obterClientePorID1(@PathVariable int id) {//essa anotation consegue pegar o que foi passado e receber
		return new Cliente(id,"Maria","987.654.321-00");
	}
	
	@GetMapping
	public Cliente obterClientePorID2(@RequestParam(name = "id") int id) {//você tem q passar na url utilizando interrogação e o nome da variavel ex: localhost:8080/cliente?id=98
		return new Cliente(id,"João Augusto","111.222.333-44");
	}
	
}
