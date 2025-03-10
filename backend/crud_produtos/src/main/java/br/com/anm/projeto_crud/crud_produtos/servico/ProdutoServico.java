package br.com.anm.projeto_crud.crud_produtos.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.anm.projeto_crud.crud_produtos.modelo.ProdutoModelo;
import br.com.anm.projeto_crud.crud_produtos.repositorio.ProdutoRepositorio;

@Service
public class ProdutoServico {
   
    @Autowired
   private ProdutoRepositorio pr;

   public Iterable<ProdutoModelo> listar(){
      return pr.findAll();
   }
}
