/*4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório
entre eles.*/

import java.util.Scanner;

public class Atv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1,num2,soma;

        System.out.println("Digite o primeiro numero:");
        num1 = scanner.nextInt();
        System.out.println("Digite o segundo numero:");
        num2 = scanner.nextInt();

        
        soma = num1+num2;
        System.out.println("A soma de "+num1+" + "+num2+" é igual a: "+soma);
    }
}
