/*Escreva um programa Java para imprimir a soma (adição), multiplicação, subtração, divisão e resto de dois números.
Dados de teste:
Insira o primeiro número: 125
Insira o segundo número: 24
Saída esperada :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 dividido por 24 = 5
        */

package basicos;

import java.util.Scanner;

public class AritmeticasBasicas {
        public static void main(String[] args) {
                Scanner caixa = new Scanner(System.in);
                System.out.printf("Digite o primeiro numero: ");
                int primeiro = caixa.nextInt();

                System.out.println("Digite o segundo numero: ");
                int segundo = caixa.nextInt();

                int soma = primeiro + segundo;
                int sub = primeiro - segundo;
                int produto = primeiro * segundo;
                int divisao = primeiro / segundo;
                // int resto = primeiro % segundo; n declarei esse carinha aqui

                System.out.println(primeiro + " + " + segundo + " = " + soma);
                System.out.println(primeiro + " - " + segundo + " = " + sub);
                System.out.println(primeiro + " x " + segundo + " = " + produto);
                System.out.println(primeiro + " / " + segundo + " = " + divisao);
                System.out.printf(primeiro + " dividido por " + segundo + " = " + divisao);

                /* Nota de aprendizado:
                n me atentei ao resto da divisao, n colocarei no meu codigo pois realmente n fiz
                mas a titulo de aprendizado e consultas futuras eh assim q se faz o resto:
                resto = primeiro % segundo;
                System.out.println(primeiro + " mod " + segundo + " = " + resto); // <--- imprime o resto
                 */

        caixa.close();
        }
}
