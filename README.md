# Sistema Bancário Simples

Este projeto simula um sistema bancário básico com operações de contas correntes, poupança e comuns. Ele permite a criação de clientes, contas bancárias e a realização de operações típicas de um banco, como depósito, saque, transferência e cálculo de juros para contas poupança. A estrutura do projeto é composta por interfaces, classes abstratas e concretas, e uma classe `Bank` que gerencia as contas e operações.

## Componentes principais:

- **Client**: Representa um cliente bancário, contendo nome e identificação.
- **AccountOperations**: Interface que define as operações básicas de uma conta, como depósito, saque e transferência.
- **Account**: Classe abstrata que implementa a interface `AccountOperations` e fornece funcionalidades comuns para contas bancárias.
- **CheckingAccount**: Classe que herda de `Account` e representa uma conta corrente.
- **SavingsAccount**: Classe que herda de `Account` e representa uma conta poupança, com a funcionalidade adicional de adicionar juros.
- **CommonAccount**: Classe que herda de `Account` e representa uma conta comum.
- **Bank**: Classe que gerencia as contas bancárias, permitindo adicionar contas e listar os saldos.

## Funcionalidades:

1. **Depósito**: Permite que um cliente deposite valores em sua conta.
2. **Saque**: Permite que um cliente retire valores da sua conta, respeitando o saldo disponível.
3. **Transferência**: Permite transferir valores entre contas, com validações de saldo e conta de destino.
4. **Juros**: Para contas poupança, é possível adicionar juros ao saldo de acordo com uma taxa especificada.
5. **Gestão de contas**: O banco pode listar todas as contas cadastradas, com informações sobre o saldo e o proprietário.

## Objetivo

Esse projeto serve como uma base para entender como implementar um sistema bancário simples em Java, com foco na organização e separação de responsabilidades usando a programação orientada a objetos.
