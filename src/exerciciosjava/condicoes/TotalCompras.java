package exerciciosjava.condicoes;

import java.util.Scanner;

public class TotalCompras {

    public static double[] Item() {
        Scanner sc = new Scanner(System.in);
        double[] quantidade = new double[4];

        System.out.println("Quantas Camisetas Deseja ?");
        quantidade[0] = sc.nextDouble();

        System.out.println("Quantas calcas Deseja ?");
        quantidade[1] = sc.nextDouble();

        System.out.println("Quantas bermudas Deseja ?");
        quantidade[2] = sc.nextDouble();

        System.out.println("Quantos tenis Deseja ?");
        quantidade[3] = sc.nextDouble();

        sc.close();
        return quantidade;
    }

    public static double[] Valor() {
        double[] valor = new double[4];

        valor[0] = 31.50; // Camiseta
        valor[1] = 58.50; // Calcas
        valor[2] = 36.50; // Bermuda
        valor[3] = 70.00; // Tenis

        return valor;
    }

    public static void main(String[] args) {
        double[] quantidade = Item();
        double[] valor = Valor();

        double total = 0;

        for (int i = 0; i < quantidade.length; i++) {
            total += quantidade[i] * valor[i];
        }

        System.out.println("Total: " + total);
    }
}

