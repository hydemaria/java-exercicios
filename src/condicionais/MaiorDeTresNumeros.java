/*
Escreva um programa Java que receba três números do usuário e imprima o maior número.
Dados de teste
Insira o 1º número: 25
Insira o 2º número: 78
Insira o 3º número: 87
Saída esperada :
O maior: 87
 */

package condicionais;

import java.util.Scanner;

public class MaiorDeTresNumeros {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int primeiro = caixaDeTexto.nextInt();

        System.out.println("Digite o segundo numero: ");
        int segundo = caixaDeTexto.nextInt();

        System.out.println("Digite o terceiro numero: ");
        int terceiro = caixaDeTexto.nextInt();

        int maior = primeiro;

        if (segundo > maior) {
            maior = segundo;
        }
        if (terceiro > maior) {
            maior = terceiro;
        }

        System.out.println("O maior numero eh: " + maior);






    }
}
