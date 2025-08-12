/*
Escreva um programa Java que receba um número do usuário e gere um inteiro entre 1 e 7. Ele exibe o nome do dia da semana.
Dados de teste
Número de entrada: 3
Saída esperada :
Quarta-feira
 */

package condicionais;

import java.util.Scanner;

public class DiaDaSemana {
    public static void main(String[] args) {
        Scanner caixaDeTexto = new Scanner(System.in);
        System.out.println("Digite um numero de 1 a 7: ");
        int escolhaDoUsuario = caixaDeTexto.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Vc escolheu segunda-feira! ");
                break;
            case 2:
                System.out.println("Vc escolher terça-feira! ");
                break;
            case 3:
                System.out.println("Vc escolher quarta-feira! ");
                break;
            case 4:
                System.out.println("Vc escolher quinta-feira! ");
                break;
            case 5:
                System.out.println("Vc escolher sexta-feira! ");
                break;
            case 6:
                System.out.println("Vc escolher sábado! ");
                break;
            case 7:
                System.out.println("Vc escolher domingo! ");
                break;
            default:
                System.out.println("Vc não digitou uma opção válida. Tente novamente!");
        }
        }

    }

