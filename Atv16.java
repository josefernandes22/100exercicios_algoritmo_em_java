/*16) [DESAFIO] Escreva um programa para calcular a redução do tempo de vida de um
fumante. Pergunte a quantidade de cigarros fumados por dias e quantos anos ele
já fumou. Considere que um fumante perde 10 min de vida a cada cigarro. Calcule
quantos dias de vida um fumante perderá e exiba o total em dias.*/

import java.util.Scanner;

public class Atv16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cigarrosPorDia, anosFumando, minutosPerdidosPorDia,diasFumando,totalDeMinutosPerdidos,totalDeDiasPerdidos;

        System.out.println("Quantos cigarros voce consome por dia?");
        cigarrosPorDia = scanner.nextDouble();
        System.out.println("A quantos anos voce fuma ?");
        anosFumando = scanner.nextDouble();

        minutosPerdidosPorDia = cigarrosPorDia*10;
        diasFumando = anosFumando*365;
        totalDeMinutosPerdidos = minutosPerdidosPorDia*diasFumando;
        totalDeDiasPerdidos = ((totalDeMinutosPerdidos/60)/24);

        System.out.printf("TOTAL DE DIAS PERDIDOS = %.2f", totalDeDiasPerdidos);

    }
}
