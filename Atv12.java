/*12) Crie um programa que leia o preço de um produto, calcule e mostre o seu
PREÇO PROMOCIONAL, com 5% de desconto.*/

import java.util.Scanner;

public class Atv12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double precoProduto,precoComDesconto;

        System.out.println("Diga o preço do produto que quer o desconto:");
        precoProduto = scanner.nextDouble();

        precoComDesconto = precoProduto*0.95;

        System.out.printf("Valor final com DESCONTO = %.2f",precoComDesconto);
    }
}
