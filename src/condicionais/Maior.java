/*
Leia dois números do usuário e imprima qual é maior.
 */

package condicionais;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int a = entrada.nextInt();

        System.out.println("Digite o segundo numero: ");
        int b = entrada.nextInt();

        if (a > b ){
            System.out.println("O primeiro numero é maior!");
        } else {
            System.out.println("O segundo numero é maior!");
        }


        entrada.close();
    }
}
