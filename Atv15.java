/*15) Crie um programa que leia o número de dias trabalhados em um mês e mostre o
salário de um funcionário, sabendo que ele trabalha 8 horas por dia e ganha R$25
por hora trabalhada.*/

import java.util.Scanner;

public class Atv15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int diasTrabalhados, valorHora=25, valorDia, salarioMes;

        System.out.println("Quantos dias voce trabalhou esse mes ?");
        diasTrabalhados = scanner.nextInt();

        valorDia = valorHora*8;
        salarioMes = diasTrabalhados*valorDia;

        System.out.printf("Voce ganhou %d reais esse mês !!!",salarioMes);
    }
}
