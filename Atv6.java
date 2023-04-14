/*6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu
sucessor.*/

import java.util.Scanner;

public class Atv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("Digite um numero:");
        numero = scanner.nextInt();

        System.out.printf("ANTECESSOR = %d%n", numero-1);
        System.out.printf("SUCESSOR   = %d", numero+1);
    }
}
