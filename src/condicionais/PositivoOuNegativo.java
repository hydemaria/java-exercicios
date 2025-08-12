/*
Escreva um programa Java para obter um número do usuário e imprimir se ele é positivo ou negativo.
Número de entrada de dados de teste
: 35
Saída esperada :
O número é positivo
 */

package condicionais;

import java.util.Scanner;

public class PositivoOuNegativo {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite um numero de 1 a 12: ");
        int entrada = caixaDeTexto.nextInt();

        if (entrada > 0) {
            System.out.println("O numero é positivo!");
        } else {
            System.out.println("O numero é negativo!");
        }

        caixaDeTexto.close();
    }
}
