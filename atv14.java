/* 14) A locadora de carros precisa da sua ajuda para cobrar seus serviços. Escreva
um programa que pergunte a quantidade de Km percorridos por um carro alugado e a
quantidade de dias pelos quais ele foi alugado. Calcule o preço total a pagar,
sabendo que o carro custa R$90 por dia e R$0,20 por Km rodado.*/

import java.util.Scanner;

public class atv14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double kmRodados,valorParaPagar;
        int qntDias;

        System.out.println("Quantos dias voce utilizou o carro?");
        qntDias = scanner.nextInt();
        System.out.println("Quantos kilometros voce percorreu ?");
        kmRodados = scanner.nextDouble();

        valorParaPagar = (qntDias*90)+(kmRodados*0.2);
        System.out.printf("VALOR TOTAL A PAGAR = %.2f",valorParaPagar);
    }
}
