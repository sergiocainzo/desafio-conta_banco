## Desafio DIO: Abstraindo um Banco com POO em Java
Este projeto é a resolução de um Desafio da DIO (Digital Innovation One) focado na aplicação prática dos conceitos de Programação Orientada a Objetos (POO) em Java. O objetivo é simular um sistema bancário que gerencia dois tipos de contas: Corrente e Poupança, com funcionalidades de depósito, saque e transferência.

## Objetivo do Desafio
O desafio consiste em:

Abstrair o domínio bancário: Identificar as entidades (ex: Cliente, Conta) e seus comportamentos.

Aplicar POO: Utilizar classes, objetos, herança, polimorfismo, encapsulamento e abstração para modelar o sistema de forma organizada e eficiente.

Implementar funcionalidades básicas: depósito, saque e transferência entre contas da mesma instituição.

## Funcionalidades Implementadas
Criação de Clientes: Permite cadastrar clientes para associá-los às contas.

Criação de Contas: Possibilidade de criar Contas Correntes e Contas Poupança.

Depósito: Adiciona fundos a uma conta.

Saque: Retira fundos de uma conta, respeitando o saldo disponível.

Transferência: Move fundos de uma conta para outra, dentro da mesma instituição.

Extrato: Exibe o histórico de transações e o saldo atual de uma conta.

## Tecnologias Utilizadas
Java: Linguagem de programação principal.

POO: Aplicação rigorosa dos conceitos de Programação Orientada a Objetos.

## Conceitos de POO Aplicados
* **Encapsulamento:** Os atributos das classes são definidos como `private` ou `protected`, e seu acesso é controlado por métodos `public` (getters e setters), garantindo a integridade dos dados.

 * **Herança:** As classes `ContaCorrente` e `ContaPoupanca` **herdam** da classe `Conta`, compartilhando atributos e métodos comuns, mas com implementações específicas para suas particularidades.

 * **Polimorfismo:** Métodos como `sacar` e `depositar` são definidos na classe `Conta` e podem ter comportamentos **polimórficos** nas subclasses, permitindo que objetos de diferentes tipos de conta sejam tratados de forma genérica. O método `imprimirExtrato` é um bom exemplo de polimorfismo.

 * **Abstração:** A classe `Conta` é uma classe **abstrata**, definindo um contrato (métodos abstratos e concretos) que suas subclasses devem implementar, focando no "o quê" fazer, e não no "como" fazer.

+* **Interfaces:** A interface `IConta` é utilizada para definir um contrato claro das operações bancárias (`sacar`, `depositar`, `transferir`, `imprimirExtrato`), promovendo a flexibilidade e o desacoplamento.

 * **Classes e Objetos:** Todo o sistema é construído a partir da criação de classes que representam conceitos do mundo real (`Cliente`, `Conta`, `Banco`) e da manipulação de seus objetos.
