
** 1. Adicione o modificador de visibilidade (private, se necess�rio) para cada atributo e m�todo da classe Funcionario. Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. O que acontece? **

Por causa da visibilidade assinada, ocorre erro de compilacao:

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The field Funcionario.nome is not visible
	The field Funcionario.salario is not visible
	The field Funcionario.dataEntrada is not visible

	at br.com.caelum.cap6.sec8.TestFactory.main(TestFactory.java:7)


Esse erro pode ser resolvido com o respeito a manipula��o devida;

** 4. Por que voc� precisa do construtor sem argumentos para que a passagem do nome seja opcional? **

� necessario criar o construtor sem argumentos, pois caso esse construtor n�o seja implementado a JVM n�o consegue utilizar o que ja esta implementado sem passar um argumento;

** 5. Crie um getter para o identificador. Devemos ter um setter? **

Nao, pois apenas quem deve setar o valor � a propria classe ao instanciar outro objeto;

** 6. Por exemplo, na classe Empresa, seria interessante ter um setter e getter para a sua array de funcion�rios? N�o seria mais interessante ter um m�todo como este? **

class Empresa {
  // ...

  public Funcionario getFuncionario (int posicao) {
    return this.empregados[posicao];
  }
}

Para efeitos de utiliza��o seria mais pratica, mas para efeitos de encapsulamento n�o seria;

** 7. Com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? Por qu�? **

A empresa � instanciadas, mas n�o � possivel alocar funcionarios nela. Isso se deve pelo fato do Array de funcionarios estar apontando para um valo nulo.

** 8. (opcional) Como garantir que datas como 31/2/2012 n�o sejam aceitas pela sua classe Data? **

Criando um construtor default e impedido essa atribuicao nos metodos setters;

  
