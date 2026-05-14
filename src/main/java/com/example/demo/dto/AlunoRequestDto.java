package com.example.demo.dto;

import jakarta.validation.constraints.*;

public class AlunoRequestDto {

    @NotBlank(message = "O nome é obrigatório!")
    @Size(min = 3, max = 120, message = "O nome deve ter entre 3 e 120 caracteres.")
    private String nome;

    @NotBlank(message = "O e-mail é obrigatório!")
    @Email(message = "Informe um e-mail válido.")
    private String email;

    @Min(value = 16, message = "Idade minima é 16")
    @Max(value = 110, message = "Idade maxima é 110")
    private Integer idade;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }
}