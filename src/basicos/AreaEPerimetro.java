/*
Escreva um programa Java para imprimir a área e o perímetro de um círculo.
Dados de teste:
Raio = 7,5.
Saída esperada
: Perímetro = 47,12388980384689.
Área = 176,71458676442586
package basicos;
 */

public class AreaEPerimetro {
    public static void main(String[] args) {
        double raio = 7.5;
        double potencia = 7.5 * 7.5;
        double area = 3.1416 * potencia;
        double perimetro = 2 * 3.1416 * raio;

        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);
    }
}
