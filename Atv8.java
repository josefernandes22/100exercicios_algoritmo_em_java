/*8) Desenvolva um programa que leia uma distância em metros e mostre os valores
relativos em outras medidas.*/

import java.util.Scanner;

public class Atv8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double metro,km,hm,dam,dm,cm,mm;

        System.out.println("Digite o valor em metros:");
        metro = scanner.nextDouble();

        km = metro/1000;
        hm = metro/100;
        dam = metro/10;
        dm = metro*10;
        cm = metro*100;
        mm = metro*1000;

        System.out.printf("A distancia de %.2f%n corresponde a: ", metro);

        System.out.printf("KM = %.2f%n",km);
        System.out.printf("HM = %.2f%n",hm);
        System.out.printf("DAM = %.2f%n",dam);
        System.out.printf("DM = %.2f%n",dm);
        System.out.printf("CM = %.2f%n",cm);
        System.out.printf("MM = %.2f",mm);
    }
}
