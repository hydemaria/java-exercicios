/*
Leia um número do usuário e calcule o seu quadrado.
 */

package basicos;

import java.util.Scanner;

public class Quadrado {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int a = entrada.nextInt();

        int quadrado = a * a;

        System.out.println("O quadrado do numero " + a + " é = " + quadrado);
        entrada.close();
    }
}
