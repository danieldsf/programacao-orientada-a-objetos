** 2. Se n�o podemos dar new em Conta, qual � a utilidade de ter um m�todo que recebe uma refer�ncia a Conta como argumento? Ali�s, posso ter isso? **

Pode ser feito, especificando Conta como parametro esta sendo obrigatorio termos uma instancia de classe que implemente Conta, essa Classe sim pode ser instanciada

** 3. Qual � o problema com a classe ContaPoupanca? **

A n�o ser que ela se torne tambem uma classe abstrata, ela deve implementar o metodo atualza;

** 5.  Existe outra maneira de a classe ContaCorrente compilar se voc� n�o reescrever o m�todo abstrato? **

Pode caso seja definido uma implementacao default para o metodo abstrato

** 6. Pra que ter o m�todo atualiza na classe Conta se ele n�o faz nada? O que acontece se simplesmente apagarmos esse m�todo da classe Conta e deixarmos o m�todo atualiza nas filhas? **

Essa declara��o de metodo abstrato define um padr�o de assinatura que tem que ser ESTRITAMENTE observado pelas classes filha, caso essa especifica��o n�o exista as classes filhas podem implementar um metodo de atualiza��o como bem desejarem, o que em algumas situa��es � ruim.

** 7. Posso chamar um m�todo abstrato de dentro de um outro m�todo da pr�pria classe abstrata? Um exemplo: o mostra do Funcionario pode invocar this.getBonificacao()? **

Sim.






 