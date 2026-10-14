<div align="center">

# 🎤 Aplicação Agenda Show

**Aplicação web em Java com Spring Boot, MySQL e testes automatizados com Selenium WebDriver**

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Selenium](https://img.shields.io/badge/Selenium-43B02A?style=for-the-badge&logo=selenium&logoColor=white)
![Swagger](https://img.shields.io/badge/Swagger-85EA2D?style=for-the-badge&logo=swagger&logoColor=black)

</div>

---

## 📖 Sobre o projeto

A **Agenda Show** é uma aplicação web desenvolvida com **Java** e **Spring Boot**, que utiliza **MySQL** como banco de dados. O projeto também conta com **testes automatizados web** feitos com **Selenium WebDriver** e documentação dos endpoints via **Swagger**.

---

## 🛠️ Tecnologias

- ☕ **Java**
- 🍃 **Spring Boot**
- 📦 **Maven**
- 🐬 **MySQL** (via XAMPP)
- 🤖 **Selenium WebDriver** (testes automatizados)
- 📚 **Swagger** (documentação da API)

---

## ✅ Pré-requisitos

Para executar o projeto, é necessário ter instalado:

- [Java](https://www.oracle.com/java/technologies/downloads/)
- [Maven](https://maven.apache.org/download.cgi)
- [XAMPP](https://www.apachefriends.org/)
- [MySQL](https://www.mysql.com/)

---

## ▶️ Como executar

**1️⃣ Inicie o MySQL no XAMPP**

Abra o painel do XAMPP e inicie o módulo **MySQL**.

**2️⃣ Configure a conexão com o banco**

| Configuração | Valor |
|--------------|-------|
| **Porta** | `3306` |
| **Usuário** | `root` |
| **Senha** | *(vazia)* |

**3️⃣ Inicie o Spring Boot**

Execute a aplicação pela sua IDE ou via Maven:

```bash
mvn spring-boot:run
```

---

## 🔗 Acessos

Com a aplicação em execução, utilize os links abaixo:

| Recurso | URL |
|---------|-----|
| 🌐 **Aplicação web** | [http://localhost:8080/agendaShow](http://localhost:8080/agendaShow) |
| 📚 **Swagger (endpoints)** | [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) |

---

## 🧪 Testes automatizados

Os testes web com **Selenium WebDriver** estão em:

```
src/test/java/agendaShowEventos/AgendaShowTestWeb.java
```

> 💡 Mantenha a aplicação em execução (e o MySQL ativo) antes de rodar os testes.

---

## 📝 Artigo no Medium

Quer entender como o projeto foi criado? Veja o passo a passo no artigo:

👉 [Inicializando e criando uma aplicação web Java com Spring Boot](https://medium.com/@alanpaulodejesus/inicializando-e-criando-uma-aplica%C3%A7%C3%A3o-web-java-com-spring-boot-62652a4484ad)

---

## 👨‍💻 Autor

Feito por **[Alan Paulo de Jesus](https://medium.com/@alanpaulodejesus)**

<div align="center">

Feito com ☕ e Spring Boot

</div>
