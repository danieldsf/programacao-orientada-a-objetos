** 1 - Porque esse código não compila? **

Um metodo estatico não pode acessar um atributo não estatico.

** 2 - Imagine que tenha uma classe FabricaDeCarro e quero garantir que só existe um objeto desse tipo em toda a memória. Não existe uma palavra chave especial para isto em Java, então teremos de fazer nossa classe de tal maneira que ela respeite essa nossa necessidade. Como fazer isso? (pesquise: singleton design pattern) **

Manipulando as referencias, segue no exemplo de codigo FabricaDeCarros

[DevMedia Singleton](http://www.devmedia.com.br/trabalhando-com-singleton-java/23632)