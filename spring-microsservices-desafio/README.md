# 🏗 Microsserviços com Spring Boot - Desafio DIO

Este projeto implementa uma arquitetura de microsserviços em **Java + Spring Boot**, simulando um **armazém (warehouse)** e uma **vitrine (storefront)** que se comunicam via HTTP e RabbitMQ.

## 📌 Arquitetura
- **Warehouse (8081)** → gerencia produtos e estoque.
- **Storefront (8082)** → consome produtos e simula compras.
- **RabbitMQ** → responsável pela comunicação assíncrona.

## 🚀 Como rodar
1. Subir o RabbitMQ
```bash
docker-compose up -d
```

2. Rodar cada microsserviço:
```bash
cd warehouse
mvn spring-boot:run
cd ../storefront
mvn spring-boot:run
```

## 🧪 Testes
- `http://localhost:8081/products` → retorna produtos do Warehouse  
- `http://localhost:8082/catalog` → retorna catálogo no Storefront  

