package br.com.curso.exerciciosSB.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.curso.exerciciosSB.model.entities.Produto;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {

	@PostMapping(path = "{nome}")
	public Produto novoProduto(@RequestParam String nome) {
		Produto produto = new Produto(nome);
		return produto;
	}
}
