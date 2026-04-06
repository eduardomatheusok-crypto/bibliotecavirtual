# 📚 Sistema de Cadastro de Livros

## 📖 Descrição
Projeto de **biblioteca virtual** com foco no **back-end em Java + Spring Boot**, que implementa toda a lógica de cadastro, remoção e atualização de livros.  

O **front-end em HTML, CSS e JavaScript** foi criado apenas para **facilitar a interação com o usuário** e testar a comunicação com as APIs do back-end.  

O sistema também integra uma **API externa** para buscar automaticamente imagens de capa a partir do título, autor e ano do livro, e utiliza **API REST** para comunicação entre front-end e back-end.

---

## ✨ Funcionalidades
- 📝 Cadastro de livros com informações completas: título, autor, ano e capa  
- ❌ Remoção de livros do catálogo  
- ✅ Marcação de livros como “lido” ou “não lido”  
- 🌐 Integração com **API externa** para obtenção de capas  
- 🔗 Comunicação entre front-end e back-end via **API REST**  
- 💻 Front-end simples e funcional para interação com o usuário  

---

## 🛠 Tecnologias utilizadas
- **Back-end (foco principal):** Java, Spring Boot  
- **Front-end (apenas interface):** HTML, CSS, JavaScript  
- **Banco de dados:** H2 / MySQL (ou outro de sua escolha)  
- **APIs externas:** Obtenção automática de imagens de capa  
- **Comunicação:** API REST e requisições HTTP  

---

## 🚀 Como rodar o projeto

### 1️⃣ Back-end (Spring Boot)
1. Abra o projeto no seu IDE (ex.: IntelliJ, Eclipse).  
2. Configure o banco de dados (H2 ou MySQL).  
3. Execute a aplicação Java (`Application.java`).  
4. O back-end ficará disponível em `http://localhost:8080`.  

### 2️⃣ Front-end
1. Abra o arquivo `index.html` no navegador.  
2. O front-end envia requisições ao back-end para listar, cadastrar, remover e atualizar livros.  

---

## 🎯 Objetivo do projeto
- Demonstrar **desenvolvimento back-end completo** com Java + Spring Boot  
- Implementar **API REST** para comunicação entre front-end e back-end  
- Integrar serviços externos via APIs (imagens de capa)  
- Criar uma interface simples para **testar funcionalidades** e interação com o usuário  
