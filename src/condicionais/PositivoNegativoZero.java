/*
Escreva um programa Java que leia um número de ponto flutuante e imprima "zero" se o número for zero. Caso contrário, imprima "positivo" ou "negativo". Adicione "pequeno" se o valor absoluto do número for menor que 1, ou "grande" se for maior que 1.000.000.
Dados de teste
Insira um número: 25
Saída esperada :
Valor de entrada: 25
Número positivo
 */

package condicionais;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double a = caixaDeTexto.nextDouble();


        if (a == 0) {
            System.out.println("Vc digitou zero!");
        } else if (a > 0) {
            System.out.println("Vc digitou " + a);
            System.out.println("Numero positivo!");
        } else {
            System.out.println("Vc digitou " + a);
            System.out.println("Numero negativo!");

        }

        caixaDeTexto.close();





    }
}
