package com.example.demo.model;

public class Aluno {
    private Long id;
    private String nome;
    private String email;
    private Integer idade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Aluno(Long id, String nome, String email, Integer idade){
        this.id = id;
        this.email = email;
        this.nome = nome;
        this.idade = idade;
    }



}
