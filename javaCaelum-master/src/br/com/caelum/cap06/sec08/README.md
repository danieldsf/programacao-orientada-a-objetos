
** 1. Adicione o modificador de visibilidade (private, se necessário) para cada atributo e método da classe Funcionario. Tente criar um Funcionario no main e modificar ou ler um de seus atributos privados. O que acontece? **

Por causa da visibilidade assinada, ocorre erro de compilacao:

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	The field Funcionario.nome is not visible
	The field Funcionario.salario is not visible
	The field Funcionario.dataEntrada is not visible

	at br.com.caelum.cap6.sec8.TestFactory.main(TestFactory.java:7)


Esse erro pode ser resolvido com o respeito a manipulação devida;

** 4. Por que você precisa do construtor sem argumentos para que a passagem do nome seja opcional? **

É necessario criar o construtor sem argumentos, pois caso esse construtor não seja implementado a JVM não consegue utilizar o que ja esta implementado sem passar um argumento;

** 5. Crie um getter para o identificador. Devemos ter um setter? **

Nao, pois apenas quem deve setar o valor é a propria classe ao instanciar outro objeto;

** 6. Por exemplo, na classe Empresa, seria interessante ter um setter e getter para a sua array de funcionários? Não seria mais interessante ter um método como este? **

class Empresa {
  // ...

  public Funcionario getFuncionario (int posicao) {
    return this.empregados[posicao];
  }
}

Para efeitos de utilização seria mais pratica, mas para efeitos de encapsulamento não seria;

** 7. Com esse construtor, o que acontece se tentarmos dar new Empresa() sem passar argumento algum? Por quê? **

A empresa é instanciadas, mas não é possivel alocar funcionarios nela. Isso se deve pelo fato do Array de funcionarios estar apontando para um valo nulo.

** 8. (opcional) Como garantir que datas como 31/2/2012 não sejam aceitas pela sua classe Data? **

Criando um construtor default e impedido essa atribuicao nos metodos setters;

  
