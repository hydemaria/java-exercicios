/*
Escreva um programa Java que receba dois números como entrada e exiba o produto dos dois números.
Dados de teste:
Insira o primeiro número: 25
Insira o segundo número: 5
Saída esperada :
25 x 5 = 125
 */

package basicos;

import java.util.Scanner;

public class ProdutoDoisNumeros {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Insira o primeiro numero: ");
        int primeiroNumero = caixaDeTexto.nextInt();

        System.out.println("Insira o segundo numero: ");
        int segundoNumero = caixaDeTexto.nextInt();

        int produto = primeiroNumero * segundoNumero;

        System.out.println(primeiroNumero + " x " + segundoNumero + " = " + produto);
    }

    /* Nota de aprendizado:
    na resolução deste exercicio não foi criada uma variavel pra multiplicação
    no caso seria  System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
    mas criei a variavel pq sei lá, parece que fica mais limpo e menos possibilidade de erro
     */
}
