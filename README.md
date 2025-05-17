# 🧱 Arquitetura de Microsserviços com Spring Boot

Este projeto é uma prova de conceito de arquitetura baseada em **microsserviços** utilizando o ecossistema Spring (Spring Boot, Spring Cloud, Eureka, Gateway e Config Server). Ele visa demonstrar os princípios básicos da separação de responsabilidades, comunicação entre serviços, descoberta de serviços e centralização de configurações.

---

## 📦 Estrutura de Serviços

```bash
arquitetura-microsservicos/
├── config-server       # Servidor central de configuração (Spring Cloud Config)
├── discovery-server    # Servidor de descoberta Eureka
├── gateway-service     # API Gateway centralizado
├── order-service       # Serviço responsável por pedidos
├── product-service     # Serviço responsável por produtos


🚀 Tecnologias Utilizadas
Java 17

Spring Boot

Spring Cloud (Eureka, Gateway, Config Server)

Spring Web

OpenFeign

Lombok

Docker (opcional)

Maven

📌 Funcionalidades Implementadas
Registro de microsserviços com Eureka Server

Roteamento de requisições via API Gateway

Centralização de propriedades via Spring Cloud Config

Comunicação entre serviços com Feign Client

Separação de contexto por domínio (order-service, product-service)


🛠️ Como Executar Localmente
Para executar o projeto, inicie os serviços individualmente em sua IDE (por ordem de dependência) ou use docker-compose caso esteja configurado.

📍 Ordem de inicialização:
discovery-server

config-server

product-service

order-service

gateway-service

🧪 Exemplos de Endpoints (via Gateway)
Serviço	Rota de exemplo
Retorna todas as pessoas	http://localhost:55675/api/pessoas


O gateway escuta na porta 8083.

🔧 Variáveis de Configuração
As configurações (ex: portas, URLs, nomes dos serviços) são gerenciadas via config-server, que busca os dados de um repositório de configurações (pode ser local ou remoto).

🧰 Possíveis Melhorias Futuras
Integração com banco de dados (PostgreSQL, MongoDB)

Autenticação com Spring Security + JWT

Monitoramento com Spring Boot Admin ou Prometheus + Grafana

Testes de integração entre serviços

Mensageria com Kafka ou RabbitMQ


🧑‍💻 Autor
Desenvolvido por Benny Lopes como estudo de arquitetura de microsserviços com Spring.

📄 Licença
Este projeto está sob a licença MIT - veja o arquivo LICENSE para mais detalhes.
