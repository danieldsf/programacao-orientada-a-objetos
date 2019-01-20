
** 2. Tente chamar o método getSaldo através da referência t, o que ocorre? Por quê?  **

A referencia não permite acessar o método getSaldo, pois você não existe a garantia de que o Tributavel em questão tem esse método. O que é certo é que os metodos definidos em Tributavel TEM de ser implementados.

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method getSaldo() is undefined for the type Tributavel

	at br.com.caelum.cap10.sec5.TestaTributavel.main(TestaTributavel.java:15)

** 3. Quais os benefícios de manter o código com baixo acoplamento? **

Os beneficios incluem maior escalabilidade, para poder realizar alterações, é possivel tambem diversificar a utilização do metodo para classes com essencias completamente diferentes.	
	