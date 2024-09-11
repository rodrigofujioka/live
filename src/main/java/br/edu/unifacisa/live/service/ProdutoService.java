package br.edu.unifacisa.live.service;

import br.edu.unifacisa.live.model.Produto;
import br.edu.unifacisa.live.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Slf4j
@RequiredArgsConstructor
@Service
public class ProdutoService {

    private final ProdutoRepository repository;

    public Produto save(Produto produto){
        log.info("Salvando produto: {} ", produto );
        return  repository.save(produto);
    }

    public List<Produto> findAll(){
        log.info("Listando todos os produtos ");
        return repository.findAll();
    }

    public Optional<Produto> findById(Long id){
        log.info("Buscando produto pelo ID : {} ", id );
        return repository.findById(id);
    }

    public void deleteById(Long id){

        log.info("Deletando produto pelo ID : {} ", id );
        repository.deleteById(id);
    }
}
