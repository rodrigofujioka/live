package br.edu.unifacisa.live.controller;

import br.edu.unifacisa.live.model.Produto;
import br.edu.unifacisa.live.service.ProdutoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    private final ProdutoService service;

    @GetMapping
    public ResponseEntity<List<Produto>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<Produto> save(@RequestBody Produto produto){
        return ResponseEntity.status(HttpStatus.CREATED)
                .body(service.save(produto));
    }

    @GetMapping("/{codigo}")
    public ResponseEntity<Produto> findById(@PathVariable Long codigo){
        return service.findById(codigo)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{codigo}")
    public ResponseEntity<Void> deleteById(@PathVariable Long codigo){
        service.deleteById(codigo);
        return ResponseEntity.noContent().build();
    }

}
