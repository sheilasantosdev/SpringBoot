Claro, aqui está o README.md formatado corretamente para o GitHub:

# Projeto Spring Boot

## Visão Geral

Este projeto é uma aplicação Spring Boot com operações CRUD básicas para gerenciar a entidade `Pessoa`. Ele utiliza Spring Data JPA e H2 Database.


## Dependências

- Spring Web
- Spring Data JPA
- H2 Database

## Entidade

Crie a entidade `Pessoa` no pacote `model` com os atributos: `nome`, `cpf`, `login`, `senha`, `idade`.

## Repositório

Crie a interface `PessoaRepository` no pacote `repository`:

## Serviço

Crie a classe `PessoaService` no pacote `service` com os métodos: `save`, `findAll`, `findById`, `deleteById`.

## Controlador

Crie a classe `PessoaController` no pacote `controller` com os endpoints: `save`, `findAll`, `findById`, `deleteById`.

```bash
./mvnw spring-boot:run
```

Ou execute a classe principal diretamente na sua IDE.
