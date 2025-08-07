/*
Escreva um programa Java que receba um número como entrada e imprima sua tabuada de multiplicação até 10.
Dados de teste:
Insira um número: 8
Saída esperada :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80
 */
package basicos;

import java.util.Scanner;

public class TabelaDeMultiplicacao {
    public static void main(String[] args) {
        Scanner caixa = new Scanner(System.in);

        System.out.printf("Digite um numero: ");
        int numero = caixa.nextInt();

        System.out.println(numero + " x " + "1 " + " = " + (numero * 1) );
        System.out.println(numero + " x " + "2 " + " = " + (numero * 2) );
        System.out.println(numero + " x " + "3 " + " = " + (numero * 3) );
        System.out.println(numero + " x " + "4 " + " = " + (numero * 4) );
        System.out.println(numero + " x " + "5 " + " = " + (numero * 5) );
        System.out.println(numero + " x " + "6 " + " = " + (numero * 6) );
        System.out.println(numero + " x " + "7 " + " = " + (numero * 7) );
        System.out.println(numero + " x " + "8 " + " = " + (numero * 8) );
        System.out.println(numero + " x " + "9 " + " = " + (numero * 9) );
        System.out.println(numero + " x " + "10 " + " = " + (numero *10) );


        /* Notas de aprendizado:
        fiz esse exercicio de maneira burra, ate pensei em usar for ou while mas preferi ter trabalho!
        solução dos malandro:
          for (int i = 0; i < 10; i++) {
          System.out.println(num1 + " x " + (i + 1) + " = " + (num1 * (i + 1)));
         */

        caixa.close();




    }

}
