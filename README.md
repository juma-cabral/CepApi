#  API de Consulta de CEP

 | Projeto Prático de Back-End

Este projeto é uma **API REST** desenvolvida em **Java** com o framework **Spring Boot** para a consulta de dados de endereços a partir de um CEP. A aplicação processa requisições e retorna as informações de localização formatadas em estruturas **JSON**. O gerenciamento de dependências e a construção do projeto foram realizados utilizando o **Maven**.

---

##  Funcionalidades

- Recebe um CEP como parâmetro na URL.
- Consulta e valida o formato do CEP inserido.
- Retorna os dados de endereço completos (Rua, Bairro, Cidade, Estado) no formato JSON.
- Tratamento de exceções para CEPs inválidos ou não encontrados.

---

## Tecnologias e Ferramentas Utilizadas

O ecossistema do projeto foi construído utilizando as seguintes tecnologias:

- **Java (JDK 17 ou superior):** Linguagem principal do desenvolvimento.
- **Spring Boot:** Framework para aceleração e estruturação da aplicação REST.
- **Spring Web:** Para criação dos endpoints e manipulação de requisições HTTP.
- **Maven:** Gerenciador de dependências e automação do build.
- **JSON:** Formato de dados utilizado para a comunicação na API.

---

## Estrutura do Projeto (Padrão MVC)

A arquitetura do código foi organizada seguindo as boas práticas de divisão em camadas para facilitar a manutenção e escalabilidade:

```text
src/main/java/com/seuusuario/apicep/
│
├── controller/     # Camada que expõe os endpoints da API (Recebe as requisições HTTP)
├── model/          # Classes que representam a estrutura dos dados (Entidades/DTOs)
├── service/        # Camada com as regras de negócio e lógica de validação do CEP
└── ApiCepApplication.java  # Classe principal que inicializa o Spring Boot
