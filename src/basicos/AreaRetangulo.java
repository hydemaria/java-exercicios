/*Escreva um programa Java para imprimir a área e o perímetro de um retângulo.
Dados de teste:
Largura = 5,5 Altura = 8,5

Área de saída esperada
é 5,5 * 8,5 = 47,60
Perímetro é 2 * (5,5 + 8,5) = 28,20
 */

package basicos;

public class AreaRetangulo {
    public static void main(String[] args) {
        double largura = 5.5;
        double altura = 8.5;
        double area = largura * altura;
        double perimetro = 2 * (largura + altura);

        System.out.println("A area é " + largura + " X " + altura + " = " + area);
        System.out.println("O perimetro é 2 * (5.5 + 8.5) = " + perimetro);


    }
}
