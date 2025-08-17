/*
Leia um número do usuário e imprima se é par ou ímpar.
 */

package condicionais;

import java.util.Scanner;

public class IfParOuImpar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();

        if (a % 2 == 0) {
            System.out.println("O numero digitado é par!");
        } else {
            System.out.println("O numero digitado é impar!");
        }


        entrada.close();

    }
}
