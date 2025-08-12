/*
Escreva um programa Java para encontrar o número de dias em um mês.
Dados de teste
Insira um número de mês: 2
Entrada por ano: 2016
Saída esperada :
Fevereiro de 2016 tem 29 dias
 */

package condicionais;

import java.util.Scanner;

public class DiasNoMês {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o número de um 1 a 12: ");

        int escolhaDoUsuario = scanner.nextInt();

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("Janeiro tem 31 dias.");
                break;
            case 2:
                System.out.println("Fevereiro tem 28 dias.");
                break;
            case 3:
                System.out.println("Março tem 31 dias.");
                break;
            case 4:
                System.out.println("Abril tem 30 dias.");
                break;
            case 5:
                System.out.println("Maio tem 31 dias.");
                break;
            case 6:
                System.out.println("Junho tem 30 dias.");
                break;
            case 7:
                System.out.println("Julho tem 31 dias.");
                break;
            case 8:
                System.out.println("Agosto tem 31 dias.");
                break;
            case 9:
                System.out.println("Setembro tem 30 dias.");
                break;
            case 10:
                System.out.println("Outubro tem 31 dias.");
                break;
            case 11:
                System.out.println("Novembro tem 30 dias.");
                break;
            case 12:
                System.out.println("Dezembro tem 31 dias.");
                break;
            default:
                System.out.println("Vc não digitou uma opção válida. Tente novamente!");
        }





        scanner.close();
    }
}
