Claro, aqui está o README.md formatado corretamente para o GitHub:

# Projeto Spring Boot

## Visão Geral

Este projeto é uma aplicação Spring Boot com operações CRUD básicas para gerenciar a entidade `Pessoa`. Ele utiliza Spring Data JPA e H2 Database.

## Índice

- [Introdução](#introdução)
- [Dependências](#dependências)
- [Configuração](#configuração)
- [Entidade](#entidade)
- [Repositório](#repositório)
- [Serviço](#serviço)
- [Controlador](#controlador)
- [Executando a Aplicação](#executando-a-aplicação)

## Introdução

Para começar com este projeto:

1. Clone o repositório:
   ```bash
   git clone https://github.com/sheilasantosdev/SpringBoot.git
   cd SpringBoot
   ```

2. Abra o projeto na sua IDE favorita.

3. Compile o projeto usando Maven ou Gradle.

## Dependências

- Spring Web
- Spring Data JPA
- H2 Database

## Configuração

No arquivo `src/main/resources/application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
```

## Entidade

Crie a entidade `Pessoa` no pacote `model` com os atributos: `nome`, `cpf`, `login`, `senha`, `idade`.

## Repositório

Crie a interface `PessoaRepository` no pacote `repository`:

```java
package com.example.demo.repository;

import com.example.demo.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
```

## Serviço

Crie a classe `PessoaService` no pacote `service` com os métodos: `save`, `findAll`, `findById`, `deleteById`.

## Controlador

Crie a classe `PessoaController` no pacote `controller` com os endpoints: `save`, `findAll`, `findById`, `deleteById`.

## Executando a Aplicação

Para executar a aplicação, use:

```bash
./mvnw spring-boot:run
```

Ou execute a classe principal diretamente na sua IDE.
