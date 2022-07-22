package br.dh.meli.perolas.controller;

import br.dh.meli.perolas.dto.DtoJoia;
import br.dh.meli.perolas.model.DtoMensagem;
import br.dh.meli.perolas.model.Joia;
import br.dh.meli.perolas.service.IJoiaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("v1/joia")
public class JoiasController {
    @Autowired
    private IJoiaService service;

    @PostMapping("/inserir")
    public ResponseEntity<DtoJoia> castrarJoias(@RequestBody Joia joia){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.cadastrarJoia(joia));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Joia> buscarJoia(@PathVariable long id){
        return ResponseEntity.ok(service.buscarJoia(id));
    }
    @GetMapping
    public ResponseEntity<List<Joia>> listarJoias(){
        return ResponseEntity.ok(service.listarJoiasCadastradas());
    }

    @DeleteMapping("/excluir")
    public ResponseEntity<DtoMensagem> deletarJoia(@RequestParam long id){

        return ResponseEntity.status(HttpStatus.OK).body(service.deletarJoia(id));
    }

    @PutMapping("/atualizar")
    public ResponseEntity<Joia> atualizar(@RequestBody Joia joia){
        return ResponseEntity.ok(service.atualizarJoia(joia));
    }

    @PatchMapping("/atualizar")
    public ResponseEntity<Joia> atualizarParcial(@RequestParam long id, @RequestBody Map<String, Object> mudancas){
        return ResponseEntity.ok(service.atualizarJoiaParcial(id, mudancas));
    }



}
