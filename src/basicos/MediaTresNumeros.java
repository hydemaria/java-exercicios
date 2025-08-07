/*Escreva um programa Java que receba três números como entrada para calcular e imprimir a média dos números.
*/

package basicos;

import java.util.Scanner;

public class MediaTresNumeros {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        int a = caixaDeTexto.nextInt();
        int b = caixaDeTexto.nextInt();
        int c = caixaDeTexto.nextInt();

        int media = a + b + c / 3;

        System.out.println("A média é: " + media);




        caixaDeTexto.close();


    }

}
