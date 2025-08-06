/*Escreva um programa Java para imprimir os resultados das seguintes operações.
Dados de teste:
a. -5 + 8 * 6
b. (55+9) % 9
c. 20 + -3*5 / 8
d. 5 + 15 / 3 * 2 - 8 % 3
Saída esperada :
43
1
19
13
*/
package basicos;

public class OperacoesAritmeticas {
    public static void main(String[] args) {
        int primeiraOperacao = -5 + (8 *6);
        int segundaOperacao = (55+9) % 9;
        int terceiraOperacao = 20 + ((-3*5)/8);
        int quartaOperacao = 5 + (15 / 3) * 2 - (8 % 3);


        System.out.println(primeiraOperacao);
        System.out.println(segundaOperacao);
        System.out.println(terceiraOperacao);
        System.out.println(quartaOperacao);
    }

    /* Nota de aprendizado:
    ao consultar a resposta desse exercicio, vi q era pra fazer SUPER simples :
    exemplo: System.out.println(-5 + 8 * 6);
    porem criei variaveiskkk
    em minha defesa, estou estudando JAVA então preciso ser verbosa ok?
    sem surto
     */
}
