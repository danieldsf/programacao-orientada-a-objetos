
** 2. Tente chamar o m�todo getSaldo atrav�s da refer�ncia t, o que ocorre? Por qu�?  **

A referencia n�o permite acessar o m�todo getSaldo, pois voc� n�o existe a garantia de que o Tributavel em quest�o tem esse m�todo. O que � certo � que os metodos definidos em Tributavel TEM de ser implementados.

Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The method getSaldo() is undefined for the type Tributavel

	at br.com.caelum.cap10.sec5.TestaTributavel.main(TestaTributavel.java:15)

** 3. Quais os benef�cios de manter o c�digo com baixo acoplamento? **

Os beneficios incluem maior escalabilidade, para poder realizar altera��es, � possivel tambem diversificar a utiliza��o do metodo para classes com essencias completamente diferentes.	
	