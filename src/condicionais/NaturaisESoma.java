/*
Escreva um programa Java para exibir n termos de números naturais e sua soma.
Dados de teste
Digite o número: 2
Saída esperada :
Número de entrada:
2
Os primeiros n números naturais são:
2
1
2
A soma dos números naturais até n termos:
23
 */

package condicionais;

import java.util.Scanner;

public class NaturaisESoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um numero: ");

        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Os primeiro numeros n numeros naturais são: ");

        int soma = 0;
        for (int i = 1; i <= escolhaDoUsuario; i++) {
            soma +=i;
        }

        System.out.println("A soma dos numeros naturais ate n termos: ");
        System.out.println(soma);
    }
}
