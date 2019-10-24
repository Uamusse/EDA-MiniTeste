# Teste Diagnóstico-Revisão de Conceitos de POO

1. Sobre um Cartao SIM sabe-se o proprietario,número de telefone, o saldo e a operadora. Crie uma classe abstrata para representar um Cartao. (6.0)
I. Adicione 3 construtores
  i. Sem parâmetros
    ii. Com inicialização do número de telefone
      iii. Com todos dados

II. Adicione pelomenos um método de acesso e de modificação e faça o override do método toString();

III. Adicione um método abstrato que permite recarregar com base em um valor de credito por parâmetro. (NB: o valor passado por parâmetro,      é o credito a recarregar)

IV. Adicione um método que permite transferir dinheiro de um cartão para o outro.

3.2 Aplicando o conceito de Herança crie duas subclasses da classe cartão, CartaoVodaCom, e CartaoMcel que criam por default cartões, com um saldo inicial de 20 MT. Para o CartaoVodaCom importa saber o país onde a loja se encontra e para o CartaoMcel importa saber a localizacao da loja onde o cartao foi adquirido.Crie os métodos de acesso e de modificação apenas para os atributos especificos das subclasses (8.0)
  3.1.1 Em cada uma das classes faça o override do método:
    a. abstrato recarregar de forma que a cada recarga adicione-se um bónus correspondente a 50% do valor recarregago;
      b. toString();
  3.1.2 Em cada uma das classes faça o overload deste método de forma que o valor percentual de bónus seja passado por parâmetro para uso   em casos de bónus diferente de 50%.

3.3 Crie uma classe CartaoTeste, que tenha um menú funcional com as seguintes opções: (5.0)
  a) Regitar catão da Vodacom;
    b) Registar cartão da Mcel;
      c) Recarregar o saldo de um cartão dado;
        d) Transferir saldo entre dois cartões da mesma operadora;
           e) Listar a informação de todos os cartões registados pela ordem crescente dos seus saldos;

3.4 Toda a informação dos cartões deve ser manipulada com o auxílio a uma colecção de objectos e armazenada num ficheiro de objectos. (1.0)
...
