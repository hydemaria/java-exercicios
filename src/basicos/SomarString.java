/*
Converta uma String que contém número em int e some 10.
 */

package basicos;

import java.util.Scanner;

public class SomarString {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int numero = entrada.nextInt();
        int soma = numero + 10;

        String texto = Integer.toString(soma);

        System.out.println("O resultado é: " + soma);

        entrada.close();
    }
}
