
# To-do List

Este projeto foi desenvolvido para um desafio de uma vaga de Desenvolvedor Júnior Backend Liferay da Simplify. Eu não apliquei para a vaga, fiz para estudos próprios. O link do desafio é [Desafio Júnior Backend Simplify](https://github.com/simplify-tec/desafio-junior-backend-simplify).

## Tecnologias Utilizadas

- Spring Boot
- Spring Data JPA
- MySQL

## Práticas Adotadas

- SOLID
- API REST
- Injeção de dependência
- Tratamento de respostas de erro
- Consultas com Spring Data JPA

## Como Executar

1. Clonar o repositório git:
   ```bash
   git clone https://github.com/dinizhugo/desafio-junior--todolist.git
   ```

2. Construir o projeto:
   ```bash
   ./mvnw clean package
   ```

3. Executar a aplicação:
   ```bash
   java -jar target/todolist-0.0.1-SNAPSHOT.jar
   ```

## API Endpoints

Para fazer as requisições HTTP abaixo, foi utilizada a ferramenta Postman:

### Criar Tarefa (POST)

URL: `localhost:8080/todo`

Exemplo de corpo da requisição:
```json
{
    "name": "Todo",
    "description": "Todo 1",
    "status": false,
    "priority": "MAXIMUM"
}
```
**OBS**: O campo `priority` só aceita os valores `"MAXIMUM"`, `"COMMON"` ou `"MINIMUM"`.

### Listar Tarefas (GET)

URL: `localhost:8080/todo`

Exemplo de resposta:
```json
[
  {
    "id": 1,
    "name": "Todo",
    "description": "Todo 1",
    "status": false,
    "priority": "MAXIMUM"
  }
]
```

### Atualizar Tarefa (PUT)

URL: `localhost:8080/todo/{id}`

Exemplo de corpo da requisição:
```json
{
    "name": "Todo",
    "description": "Todo 1",
    "status": false,
    "priority": "MAXIMUM"
}
```

### Remover Tarefa (DELETE)

URL: `localhost:8080/todo/{id}`

Exemplo de resposta:
```json
[ ]
```
