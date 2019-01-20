# Orienta��o a Objetos Basica

## 1) Modelo de Funcionario:

Um funcionario possui:

### Atributos:

- Nome
- Departamento
- Sal�rio (double)
- Data de Entrada (String)
- Rg (String)

### Metodos:

- recebeAumento
- calculaGanhoAnual
- exibeSalario
- calculaIR

## 4) Compara��o entre funcionarios com referencias diferentes:

Ao compara com dois funcionarios que apontam para objetos diferentes, o valor retornado � falso, eles n�o s�o vistos como iguais, mesmo com o mesmo valor para atributos.

## 5) Compara��o entre funcionarios com mesma referencia: 

Ao compara com dois funcionarios que apontam para objetos iguais, o valor retornado � verdadeiro, eles s�o vistos como iguais, e consequentemente tambem possuem o mesmo valor para atributos.

## 7) Uso de Objeto Nulo:

Ao tentar usar um objeto que est� setado como nulo ocorre uma exce��o chamada NullPointerException, e que geralmente � apresentada como o exemplo a seguir:

Exception in thread "main" java.lang.NullPointerException
	at br.com.caelum.cap4.sec12.Funcionario.mostra(Funcionario.java:33)
	at br.com.caelum.cap4.sec12.TestFactory.main(TestFactory.java:9)
	
## 8) Tentar acessar atributo na Classe:

O c�digo lan�a uma exce��o, pois o atributo est� disponivel para instancias e nao para classes:

Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	Cannot make a static reference to the non-static field Funcionario.nome
	Syntax error, insert "VariableDeclarators" to complete LocalVariableDeclaration
	at br.com.caelum.cap4.sec12.TestFactory.main(TestFactory.java:10)

Faz sentido tem um metodo que calcula o ganho anual SE E SOMENTE SE ele retornar um valor igual para TODOS os objetos.

