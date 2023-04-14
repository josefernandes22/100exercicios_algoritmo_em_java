/*7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a
sua terça parte.*/

import java.util.Scanner;
public class Atv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;

        System.out.println("Digite um numero real:");
        numero = scanner.nextDouble();

        System.out.printf("DOBRO = %.2f%n", numero*2);
        System.out.printf("TERÇO = %.2f", numero/3);
    }
}
