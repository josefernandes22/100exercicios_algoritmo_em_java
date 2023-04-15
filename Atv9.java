/*9) Faça um algoritmo que leia quanto dinheiro uma pessoa tem na carteira (em R$)
e mostre quantos dólares ela pode comprar. Considere US$1,00 = R$4,91.*/

import java.util.Scanner;

public class Atv9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dinheiroEmReal, dinheiroEmDolar, cotação=4.91;

        System.out.println("Quantos reais você tem ?");
        dinheiroEmReal = scanner.nextDouble();

        dinheiroEmDolar = (dinheiroEmReal/cotação);

        System.out.printf("%.2f reais equivale a: %.2f dolares", dinheiroEmReal,dinheiroEmDolar);
    }
}
