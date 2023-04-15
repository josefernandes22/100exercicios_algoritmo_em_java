/*2) Faça um programa que leia o nome de uma pessoa e mostre uma mensagem de boas vindas para ela:*/

import java.util.Scanner;
public class _Atv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Qual o seu nome?");
        nome = scanner.nextLine();
        System.out.println("Olá " + nome+ " é um prazer te conheçer!");
    }
}
