/*
Imprima os primeiros n números pares e a soma deles.
    Entrada: número n
    Saída: os n primeiros números pares (2, 4, 6...) e a soma.
 */

package condicionais;

import java.util.Scanner;

public class ParesESoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++){
            int par = 2 * i;
            System.out.println(par);
            soma += par;
        }

        System.out.println("A soma dos primeiros " + numero + " numeros pares eh: " + soma);



        scanner.close();
    }
}
