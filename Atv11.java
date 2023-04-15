/*11) Desenvolva uma lógica que leia os valores de A, B e C de uma equação do
segundo grau e mostre o valor de Delta.*/

import java.util.Scanner;
public class Atv11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a,b,c,delta;
        System.out.println("Informe A: ");
        a = scanner.nextInt();
        System.out.println("Informe B: ");
        b = scanner.nextInt();
        System.out.println("Informe C: ");
        c = scanner.nextInt();

        delta = (b*b)-4*a*c;

        System.out.printf("DELTA = %d",delta);
    }
}
