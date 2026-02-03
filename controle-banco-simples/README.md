## controle-banco-simples

Esse projeto preve a realizacao do desafio do bootcamp de java que estou realizando hoje em 2026.

Nele recebi o seguinte desafio:

## Descrição
Você está desenvolvendo um programa simples em Java para simular operações bancárias básicas. A aplicação deve permitir ao usuário realizar depósitos, saques e consultar o saldo em uma conta bancária virtual.

## Entrada
O programa exibirá um menu com as seguintes opções:

Depositar
Sacar
Consultar Saldo
Encerrar
O usuário escolherá uma dessas opções digitando o número correspondente.

## Saída
Utilizando um switch, o programa realizará a operação escolhida pelo usuário.

Se o usuário escolher:

1: O programa solicitará o valor a ser depositado e atualizará o saldo. Além disso, deve imprimir o saldo atual com a mensagem "Saldo atual: {saldo com 1 casa decimal}".
2: O programa solicitará o valor a ser sacado e verificará se há saldo suficiente. Sendo assim, deve imprimir "Saldo atual: {saldo com 1 casa decimal}" quando o saldo for suficiente e "Saldo insuficiente."
3: O programa apenas exibirá o saldo atual da conta: "Saldo atual: {saldo com 1 casa decimal}".
0: O programa encerrará, imprimindo "Programa encerrado.".
Exemplos
A tabela abaixo apresenta exemplos com alguns dados de entrada e suas respectivas saídas esperadas. Certifique-se de testar seu programa com esses exemplos e com outros casos possíveis.

### Exemplos

Entrada	        Saída
1
50              Saldo atual: 50.0
2
100             Saldo insuficiente.
0	            Programa encerrado.
___
3               Saldo atual: 0.0
1
550             Saldo atual: 550.0
0	            Programa encerrado.
___
1
1000            Saldo atual: 1000.0
2
500             Saldo atual: 500.0
0	            Programa encerrado.

