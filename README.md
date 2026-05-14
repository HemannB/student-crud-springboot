# student-crud-springboot

REST API desenvolvida com Java e Spring Boot para gerenciamento de alunos, construída com fins didáticos.

---

## Tecnologias

- Java 17+
- Spring Boot
- Spring Web
- Gradle

---

## Estrutura do Projeto

```
src/main/java/com/example/demo/
├── controller/
│   └── AlunoCase.java        # Endpoints REST
├── service/
│   └── AlunoService.java     # Regras de negócio
├── model/
│   └── Aluno.java            # Entidade
└── dto/
    ├── AlunoRequestDto.java  # DTO de entrada
    └── AlunoResponseDto.java # DTO de saída
```

---

## Endpoints

### GET `/api/alunos`
Retorna a lista de todos os alunos cadastrados.

**Response `200 OK`:**
```json
[
  {
    "id": 1,
    "nome": "Hemann B",
    "email": "hemann@email.com",
    "idade": 24
  }
]
```

---

### POST `/api/alunos`
Cadastra um novo aluno.

**Request Body:**
```json
{
  "nome": "Hemann B",
  "email": "hemann@email.com",
  "idade": 24
}
```

**Response `201 Created`:**
```json
{
  "id": 1,
  "nome": "Hemann B",
  "email": "hemann@email.com",
  "idade": 24
}
```

---

## Como executar

Pré-requisitos: Java 17+ e Gradle instalados.

```bash
# Clone o repositório
git clone https://github.com/HemannB/student-crud-springboot.git

# Entre na pasta
cd student-crud-springboot

# Execute
./gradlew bootRun
```

A API estará disponível em `http://localhost:8080`.

---

## Observações

- Os dados são armazenados em memória, sem banco de dados.
- Ao reiniciar a aplicação, os dados são perdidos.
- Projeto em desenvolvimento — novos endpoints serão adicionados.