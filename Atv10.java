/*10) Faça um algoritmo que leia a largura e altura de uma parede, calcule e
mostre a área a ser pintada e a quantidade de tinta necessária para o serviço,
sabendo que cada litro de tinta pinta uma área de 2metros quadrados.*/

import java.util.Scanner;
public class Atv10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double altura,largura,area,litrosTinta;

        System.out.println("Qual a altura da parede?");
        altura = scanner.nextDouble();
        System.out.println("Qual a largura da parede?");
        largura = scanner.nextDouble();

        area = altura*largura;
        litrosTinta = area/2;

        System.out.printf("Area a ser pintada = %.2f metros quadrados %n",area);
        System.out.printf("Litros de tinta Necessarios = %.2f Litros",litrosTinta);
    }
}
