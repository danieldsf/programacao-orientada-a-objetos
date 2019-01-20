** 2. Se não podemos dar new em Conta, qual é a utilidade de ter um método que recebe uma referência a Conta como argumento? Aliás, posso ter isso? **

Pode ser feito, especificando Conta como parametro esta sendo obrigatorio termos uma instancia de classe que implemente Conta, essa Classe sim pode ser instanciada

** 3. Qual é o problema com a classe ContaPoupanca? **

A não ser que ela se torne tambem uma classe abstrata, ela deve implementar o metodo atualza;

** 5.  Existe outra maneira de a classe ContaCorrente compilar se você não reescrever o método abstrato? **

Pode caso seja definido uma implementacao default para o metodo abstrato

** 6. Pra que ter o método atualiza na classe Conta se ele não faz nada? O que acontece se simplesmente apagarmos esse método da classe Conta e deixarmos o método atualiza nas filhas? **

Essa declaração de metodo abstrato define um padrão de assinatura que tem que ser ESTRITAMENTE observado pelas classes filha, caso essa especificação não exista as classes filhas podem implementar um metodo de atualização como bem desejarem, o que em algumas situações é ruim.

** 7. Posso chamar um método abstrato de dentro de um outro método da própria classe abstrata? Um exemplo: o mostra do Funcionario pode invocar this.getBonificacao()? **

Sim.






 