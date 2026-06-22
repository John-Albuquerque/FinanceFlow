# Documento de Requisitos de Software (SRS)

## 1. Introdução
1.1 Objetivo
Este documento descreve os requisitos funcionais e não funcionais do sistema FinanceFlow, um software de código aberto destinado ao gerenciamento financeiro pessoal. O objetivo é permitir que usuários controlem receitas, despesas, contas financeiras, planejamento e geração de relatórios.
1.2 Escopo
O FinanceFlow é um sistema desktop voltado para pessoas que desejam organizar sua vida financeira. O sistema permite registrar movimentações financeiras, controlar saldo de contas, definir limites de gastos, gerar relatórios e programar despesas futuras.
1.3 Público-alvo
Usuários que desejam controlar suas finanças pessoais.
Pessoas que buscam acompanhar receitas e despesas.
Usuários interessados em planejamento financeiro.

## 2. Requisitos Funcionais
RF01 – Cadastro de Contas
O sistema deve permitir o cadastro de contas financeiras para armazenamento de dinheiro.
RF02 – Controle de Receitas
O sistema deve permitir registrar receitas, aumentando automaticamente o saldo da conta selecionada.
RF03 – Controle de Despesas
O sistema deve permitir registrar despesas, reduzindo automaticamente o saldo da conta selecionada.
RF04 – Atualização de Saldo
Sempre que uma movimentação for realizada, o saldo da conta deverá ser atualizado automaticamente.
RF05 – Limite de Gastos
O sistema deve permitir definir um limite máximo de gastos para categorias ou contas específicas.
RF06 – Relatórios Financeiros
O sistema deve disponibilizar relatórios simples e detalhados sobre receitas, despesas e saldo.
RF07 – Agendamento de Despesas
O sistema deve permitir cadastrar despesas programadas para datas futuras.
RF08 – Lembretes
O sistema deve enviar lembretes para despesas agendadas.
RF09 – Planejamento Financeiro
O sistema deve oferecer um módulo para planejamento financeiro.
RF10 – Consulta de Movimentações
O usuário deve poder visualizar todas as movimentações financeiras registradas.

## 3. Requisitos Não Funcionais
RNF01
O sistema deve possuir interface simples e intuitiva.
RNF02
O sistema deve ser compatível com Windows e Linux.
RNF03
O sistema deve ser desenvolvido como software de código aberto.
RNF04
O sistema deve possuir boa organização dos dados financeiros.
RNF05
O sistema deve permitir fácil manutenção e evolução do código.
RNF06
O sistema deve possuir desempenho suficiente para registrar movimentações sem atrasos perceptíveis.

## 4. Regras de Negócio
RN01 Uma despesa sempre reduz o saldo da conta.
RN02 Uma receita sempre aumenta o saldo da conta.
RN03 Toda movimentação deve estar vinculada a uma conta.
RN04 Uma despesa agendada só deve alterar o saldo quando executada.
RN05 Os relatórios devem considerar todas as movimentações cadastradas.

## 5. Casos de Uso
UC01 – Cadastrar Conta
Ator: Usuário
Fluxo principal:
O usuário acessa o cadastro de contas.
Informa nome da conta.
Define saldo inicial.
O sistema salva a conta.
UC02 – Registrar Receita
Ator: Usuário
Fluxo principal:
Seleciona uma conta.
Informa valor.
Informa descrição.
Confirma.
O sistema atualiza o saldo.
UC03 – Registrar Despesa
Ator: Usuário
Fluxo principal:
Seleciona uma conta.
Informa valor.
Informa descrição.
Confirma.
O sistema reduz o saldo.
UC04 – Gerar Relatório
Ator: Usuário
Fluxo principal:
Seleciona o tipo de relatório.
Escolhe o período.
O sistema gera o relatório.
UC05 – Agendar Despesa
Ator: Usuário
Fluxo principal:
Informa a despesa.
Define a data.
Salva.
O sistema agenda o lançamento.

## 6. Restrições
O sistema é destinado ao gerenciamento financeiro pessoal.
Deve funcionar em Windows e Linux.

## 7. Funcionalidades Principais
Cadastro de contas.
Controle de receitas.
Controle de despesas.
Atualização automática do saldo.
Planejamento financeiro.
Relatórios financeiros.
Limite de gastos.
Despesas programadas.
Lembretes.
Consulta de movimentações.