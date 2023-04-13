/*3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no
final uma mensagem.
Ex:
Nome do Funcionário: Maria do Carmo
Salário: 1850,45
O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.*/

import java.util.Scanner;

public class Atv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salario;

        System.out.println("Digite o nome do funcionário(a): ");
        nome = scanner.nextLine();
        System.out.println("Digite o salario do funcionário(a)");
        salario = scanner.nextDouble();

        System.out.printf("O salário de %s é de %.2f",nome, salario);
    }
}
