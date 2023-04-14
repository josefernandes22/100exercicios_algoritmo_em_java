/*5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre
na tela a sua média na disciplina.*/

import java.util.Scanner;

public class Atv5{
    public static void main(String[] args) {
        double nota1,nota2,media;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a primeira nota:");
        nota1 = scanner.nextDouble();
        System.out.println("Digite a segunda nota:");
        nota2 = scanner.nextDouble();

        media = (nota1+nota2)/2;

        System.out.printf("MÉDIA = %.2f", media);
    }
}
