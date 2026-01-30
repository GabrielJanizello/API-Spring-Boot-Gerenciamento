# API Spring Boot de Gerenciamento com Autenticação JWT

Este projeto é uma API RESTful desenvolvida em Java com Spring Boot. O objetivo principal é fornecer um sistema seguro para cadastro de usuários e gerenciamento de produtos, implementando autenticação via Tokens JWT (JSON Web Token).

## 🚀 Tecnologias Utilizadas

* **Java**
* **Spring Boot**
* **Spring Security** (Gerenciamento de autenticação e autorização)
* **JWT (JSON Web Token)** (Segurança)
* **Maven** (Gerenciamento de dependências)

## 📂 Estrutura do Projeto

O projeto segue a arquitetura em camadas:

* **Controller:** Camada responsável por expor os endpoints da API (`AuthController`, `ProdutoController`).
* **Service:** Lógica de negócios.
* **Repository:** Camada de persistência e acesso ao banco de dados.
* **Model:** Representação das entidades (`Usuario`, `Produto`).
* **Security:** Configurações de segurança, filtros de requisição e utilitários JWT (`JwtAuthFilter`, `SecurityConfig`).

## ⚙️ Funcionalidades

### Autenticação (Security)
* Registro de novos usuários.
* Login e geração de Token JWT.
* Proteção de rotas baseada em roles/permissões (via `SecurityConfig`).

### Gerenciamento
* CRUD de Produtos.
* Associação de usuários e permissões.

## 🔒 Segurança

Este projeto utiliza um filtro de autorização (`JwtAuthFilter`) que intercepta as requisições HTTP para validar o token antes de permitir o acesso aos endpoints protegidos.
