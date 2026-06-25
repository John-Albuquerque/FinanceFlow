# 💰 FinanceFlow

Sistema desktop de gerenciamento financeiro pessoal desenvolvido em **Java 21** e **JavaFX 21**.

O objetivo do FinanceFlow é oferecer uma maneira simples, organizada e intuitiva de controlar finanças pessoais, permitindo o gerenciamento de receitas, despesas, contas financeiras e planejamento de gastos futuros.

> 🚧 Projeto em desenvolvimento.

---

# 🚀 Objetivo

O FinanceFlow foi criado para auxiliar usuários no controle financeiro pessoal por meio de uma aplicação desktop moderna e de fácil utilização.

Com o sistema é possível:

* Registrar receitas e despesas
* Controlar saldos de contas financeiras
* Planejar gastos futuros
* Organizar movimentações financeiras
* Gerar relatórios para acompanhamento financeiro

---

# 🧠 Problema que o sistema resolve

Muitas pessoas enfrentam dificuldades para acompanhar sua situação financeira devido à falta de ferramentas simples e centralizadas.

Isso pode gerar:

* Desorganização financeira
* Gastos não monitorados
* Falta de planejamento
* Dificuldade para visualizar o saldo real disponível
* Pouca previsibilidade de despesas futuras

O FinanceFlow centraliza todas as movimentações em um único sistema, facilitando o controle e a tomada de decisões financeiras.

---

# 📸 Demonstração

Futuramente...

---

# ⚙️ Tecnologias Utilizadas

* Java 21
* JavaFX 21
* FXML
* CSS
* Maven (em migração)
* Arquitetura em Camadas

---

# 🏗️ Arquitetura

O projeto segue uma arquitetura em camadas para promover organização, manutenção e escalabilidade.

```text
Controller
    ↓
Service
    ↓
Repository
    ↓
Dados
```

Estrutura prevista:

```text
src/
├── controller
├── business
├── console
├── infrastructure
    ├───── entities
    ├───── util
    └───── repository
├── resources
    ├───── view
    ├───── css
```

---

# 📌 Funcionalidades

## 🏦 Gestão Financeira

* Cadastro de contas financeiras
* Controle automático de saldo
* Consulta de saldo por conta

## 💸 Movimentações

* Registro de receitas
* Registro de despesas
* Atualização automática dos saldos

## 📊 Relatórios

* Relatórios financeiros
* Consulta de movimentações
* Histórico financeiro

## 📅 Planejamento

* Agendamento de despesas futuras
* Execução automática de lançamentos programados

## 🔔 Controle Financeiro

* Definição de limites de gastos
* Alertas e lembretes financeiros
* Planejamento financeiro pessoal

---

# 🖥️ Interface

A interface foi desenvolvida utilizando JavaFX com foco em simplicidade e usabilidade.

Tecnologias utilizadas:

* FXML para construção das telas
* CSS para estilização
* Separação entre interface e regras de negócio

---

# ▶️ Como Executar

## Pré-requisitos

* Java 21
* JavaFX 21

## Configuração da VM

```bash
--module-path "C:\java-libs\javafx-sdk-21\lib" --add-modules javafx.controls,javafx.fxml
```

## Executar o Projeto

Execute a classe principal:

```text
Main.java
```

---

# 📈 Status do Projeto

### ✅ Concluído
* Tela de login
* Tela de cadastro
* Estrutura inicial do projeto
* Configuração JavaFX
* Organização em camadas
* Telas iniciais

### 🚧 Em Desenvolvimento

* Cadastro de contas
* Cadastro de receitas
* Cadastro de despesas
* Integração de serviços

### 📌 Planejado

* Banco de dados MySQL/PostgreSQL
* Relatórios avançados
* Dashboard com gráficos
* Exportação de relatórios
* Migração completa para Maven

---

# 🤝 Contribuição

Contribuições são bem-vindas.

Caso queira colaborar:

1. Faça um Fork do projeto
2. Crie uma branch para sua feature
3. Faça suas alterações
4. Abra um Pull Request

---

# 📄 Licença

Este projeto é open source e destinado a fins educacionais e de portfólio.

---

# 👨‍💻 Autor

John-Albuquerque

Desenvolvido com Java e JavaFX para estudos, prática de arquitetura de software e desenvolvimento desktop.
