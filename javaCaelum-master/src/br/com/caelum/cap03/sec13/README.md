# Respostas

## 5) Erro no resultado de fatorial para numeros grandes:

O tipo de dado int tem um limite de possibilidade de numeros, e apos o valor máximo limite, o valor minimo limite é considerado o proximo valor causando uma inconsistencia no resultado.

*O problema pode ser resolvido utilizado um tipo de dado com capacidade maior (long no caso);*