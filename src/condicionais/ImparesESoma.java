/*
Imprima os primeiros n números ímpares e a soma deles.
    Entrada: número n
    Saída: os n primeiros números ímpares (1, 3, 5...) e a soma.
 */
package condicionais;

import java.util.Scanner;

public class ImparesESoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = scanner.nextInt();

        int soma = 0;

        for (int i = 1; i <= numero; i++) {
            int impar = 2 * i - 1;
            System.out.println(impar);
            soma += impar;
        }

        System.out.println("A soma dos primeiros " + numero + " numeros impares é: " + soma);
    }
}
