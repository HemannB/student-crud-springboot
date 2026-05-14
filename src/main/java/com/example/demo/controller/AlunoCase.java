package com.example.demo.controller;

import com.example.demo.dto.AlunoRequestDto;
import com.example.demo.dto.AlunoResponseDto;
import com.example.demo.service.AlunoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/alunos")
public class AlunoCase {
    private final AlunoService alunoService;
    public AlunoCase(AlunoService alunoService){
        this.alunoService = alunoService;
    }
    @GetMapping
    public List<AlunoResponseDto> listar(){
        return alunoService.getAllAlunos();
    }

    @PostMapping
    public ResponseEntity<AlunoResponseDto> criar(@RequestBody AlunoRequestDto dto) {
        AlunoResponseDto response = alunoService.criarAluno(dto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
