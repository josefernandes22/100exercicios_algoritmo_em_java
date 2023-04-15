/*13) Faça um algoritmo que leia o salário de um funcionário, calcule e mostre o
seu novo salário, com 15% de aumento.*/

import java.util.Scanner;
public class Atv13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double salarioAntigo, salarioComAumento;

        System.out.println("Digite o salário do funcionário:");
        salarioAntigo = scanner.nextDouble();

        salarioComAumento = salarioAntigo*1.15;

        System.out.printf("SEU NOVO SALÁRIO É: %.2f", salarioComAumento);
    }
}
