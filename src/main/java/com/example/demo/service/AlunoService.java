package com.example.demo.service;

import com.example.demo.dto.AlunoRequestDto;
import com.example.demo.dto.AlunoResponseDto;
import com.example.demo.model.Aluno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AlunoService {
    private List<Aluno> alunos = new ArrayList<>();
    private Long proximoId = 1L;

    public List<AlunoResponseDto> getAllAlunos(){

        List<AlunoResponseDto> resultado = new ArrayList<>();
        for (Aluno aluno : alunos) {
            resultado.add(new AlunoResponseDto(
                    aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getIdade()
            ));
        }
        return resultado;
    }

    public AlunoResponseDto criarAluno(AlunoRequestDto dto) {
        Aluno aluno = new Aluno(proximoId++, dto.getNome(), dto.getEmail(), dto.getIdade());
        alunos.add(aluno);
        return new AlunoResponseDto(aluno.getId(), aluno.getNome(), aluno.getEmail(), aluno.getIdade());
    }
}
