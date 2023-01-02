package br.com.curso.exerciciosSB.model.repositores;

import org.springframework.data.repository.CrudRepository;

import br.com.curso.exerciciosSB.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
