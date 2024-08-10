## Exercícios Interfaces em Java

#### Bem-vindo à lista de exercícios resolvidos que exploram o uso de interfaces na Programação Orientada a Objetos em Java. Este repositório contém três exercícios que cobrem conceitos fundamentais, como cálculo de áreas, sistema de tributação e gerenciamento de imposto de renda.
 ---------
#### Exercício 1: Cálculo de Áreas
##### Objetivo: Implementar um sistema para calcular áreas de diferentes formas geométricas.
##### 1 . Defina a interface:
- Crie uma interfaceAreaCalculavelcomcalculaArea(),double.
##### 2 . Implemente as classes:
- Quadrado: atributo lado.
- Retangulo: atributo base e altura.
- Círculo: atributo raio.
##### 3 . Teste  o Sistema
- Crie uma classe de Teste com um método main que instancia um vetor de 5 posições contendo objetos do tipo AreaCalculavel e imprime a área de cada objeto.
  
------------
#### Exercício 2 . Sistema de Tributação
##### Objetivo: Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar um sistema para isso.

##### 1 . Defina a interface:
- Crie uma interfaceTributavel com o método calculaTributos(),double.
##### 2 . Implemente as classes:
- Alguns bens são tributáveis e outros não, ContaPoupanca não é tributável, já para ContaCorrente você precisa pagar 1% da conta e o SeguroDeVida tem uma taxa fixa de 42 reais.
- As classes ContaCorrente e ContaPoupanca herdam de uma classe Conta. Essa classe Conta possui um saldo e os métodos sacar(double), depositar(double) e obterSaldo() que retorna o saldo da conta.
##### 3 . Teste o Sistema 
- Vamos criar uma classe TestaTributavel com um método main para testar o nosso exemplo.
  
------------
#### Exercício 3 . Gerenciamento de Imposto de Renda
##### Objetivo: Nosso banco precisa tributar dinheiro de alguns bens que nossos clientes possuem. Para isso, vamos criar um sistema para isso.
##### 1 . Implemente as classes e Testando o Sistema:
- Crie a classe GerenciadorDeImpostoDeRenda que recebe todos os tributáveis de uma pessoa, que soma os tributos e inclua nele um método para devolver seu total
- Essa classe deve ter um atributo para calcular a soma total dos tributos e um método adicionar(Tributavel) que recebe como parâmetro um Tributavel e soma os tributos dele ao total.
- Crie um main para instanciar diversas classes que implementam Tributavel e passar como argumento para um GerenciadorDeImpostoDeRenda.
- Repare que você não pode passar qualquer tipo de conta para o método adiciona, apenas as que implementam Tributavel.

### Utilizou-se neste projeto:
- Java
- Intelijj IDEA