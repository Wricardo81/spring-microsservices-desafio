# 🏗 Microsserviços em Spring Boot - Desafio DIO

Este projeto faz parte do **Desafio da DIO**, cujo objetivo é implementar uma arquitetura de **microsserviços em Java com Spring Boot**, utilizando comunicação **síncrona (HTTP)** e **assíncrona (RabbitMQ)**.  

Ele é composto por dois microsserviços principais:  

- 📦 **Armazém (Warehouse)** → responsável pelo gerenciamento de produtos e estoque  
- 🛒 **Vitrine (Storefront)** → responsável por listar produtos e simular compras  

---

## 📌 Arquitetura

A comunicação acontece de duas formas:
- **HTTP (síncrona)**: a Vitrine consulta os produtos diretamente no Armazém  
- **RabbitMQ (assíncrona)**: eventos são trocados entre os serviços  

📊 Diagrama da arquitetura:

![Arquitetura](images/diagram.png)

---

## 🚀 Tecnologias Utilizadas

- **Java 17+**
- **Spring Boot 3**
  - Spring Web
  - Spring Data JPA
  - Spring AMQP (RabbitMQ)
- **Banco H2 (em memória)**
- **RabbitMQ (mensageria)**
- **Docker + Docker Compose**
- **Maven**

---

## ⚙️ Estrutura do Projeto
spring-microsservices-desafio/
├── warehouse/ # microsserviço de estoque
│ ├── src/
│ └── pom.xml
├── storefront/ # microsserviço de vitrine
│ ├── src/
│ └── pom.xml
├── docker-compose.yml # sobe o RabbitMQ
├── README.md
---

---

## ▶️ Como Executar o Projeto

### 1. Clonar o repositório
```bash
git clone https://github.com/Wricardo81/spring-microsservices-desafio.git
cd spring-microsservices-desafio

### 2. Subir o RabbitMQ
docker-compose up -d
Acesse o painel de administração do RabbitMQ em:
👉 http://localhost:15672
Login: guest | Senha: guest

### 3. Rodar os microsserviços

Warehouse (porta 8081)
cd warehouse
mvn spring-boot:run

Storefront (porta 8082)
cd storefront
mvn spring-boot:run
---

🧪 Testando os Endpoints
Warehouse

GET http://localhost:8081/products
Retorna os produtos cadastrados no armazém
Exemplo de resposta:
[
  { "id": 1, "name": "Notebook Gamer", "stock": 10 },
  { "id": 2, "name": "Teclado Mecânico", "stock": 25 }
]

Storefront

GET http://localhost:8082/catalog
Consome os produtos diretamente do Warehouse via HTTP

---
✨ Autor

Desenvolvido por Ricardo Santos
GitHub: @Wricardo81
Linkedin: https://www.linkedin.com/in/wildson-ricardo-0244841b8/
