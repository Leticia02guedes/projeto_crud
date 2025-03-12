package br.com.anm.projeto_crud.crud_produtos.controle;

import org.springframework.web.bind.annotation.RestController;

import br.com.anm.projeto_crud.crud_produtos.modelo.ProdutoModelo;
import br.com.anm.projeto_crud.crud_produtos.servico.ProdutoServico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class ProdutoControle {

    @Autowired
    private ProdutoServico ps;

    @PostMapping("/cadastrar")
    public ResponseEntity<?> cadastrar(@RequestBody ProdutoModelo pm){
      return ps.cadastrar(pm);
    }
    
    @GetMapping("/listar")
      public Iterable<ProdutoModelo> listar(){
        return ps.listar();
      }

    @GetMapping("/")  
    public String rota(){
        return "A API está funcionando!";
    }
}
