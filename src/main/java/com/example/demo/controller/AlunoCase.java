package com.example.demo.controller;

import com.example.demo.dto.AlunoResponseDto;
import com.example.demo.service.AlunoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
