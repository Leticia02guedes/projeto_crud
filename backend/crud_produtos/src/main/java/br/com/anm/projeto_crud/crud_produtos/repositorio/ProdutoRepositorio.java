package br.com.anm.projeto_crud.crud_produtos.repositorio;

import org.springframework.data.repository.CrudRepository;

import br.com.anm.projeto_crud.crud_produtos.modelo.ProdutoModelo;

public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Long>{
    
}
