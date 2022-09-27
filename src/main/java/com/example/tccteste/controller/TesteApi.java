package com.example.tccteste.controller;


import com.example.tccteste.model.TesteModel;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class TesteApi {

    @GetMapping("/teste")
    public ResponseEntity<?> getTeste(){
        TesteModel testeModel = new TesteModel(1L, "Um teste qualquer...");

        return ResponseEntity.ok(testeModel);
    }

    @PostMapping("/teste")
    public ResponseEntity<?> postTeste(@RequestBody TesteModel testeModel){
        return ResponseEntity.ok(testeModel);
    }
}
