/*
Escreva um programa Java para imprimir a soma de dois números.
Dados de teste:
74 + 36
Saída esperada :
110
 */

package basicos;

import java.util.Scanner;

public class SomaDoisNumeros {
    public static void main(String[] args) {
        Scanner caixaDeSoma = new Scanner(System.in);

        int a = caixaDeSoma.nextInt();
        int b = caixaDeSoma.nextInt();

        int resultado = a + b;

        System.out.println("A soma eh " + resultado);

        caixaDeSoma.close();

        /* Nota de aprendizado:
        no caso desse exercicio, ele realmente queria q eu somasse 24+26 porem me
        afobei e achei q era pra dar entrada em numero aleatorio, aff
         */
    }
}
