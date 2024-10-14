package condicoes;

import java.util.Scanner;

public class ValoresIguais {
    // Crie um algoritmo que leia dois valores (x e y) e informe se eles são iguais.
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int x, y;
        System.out.println("Vamos verificar se os valores sao iguais.");
        System.out.println("Digite um valor inteiro X: ");
        x = valor.nextInt();
        System.out.println("Digite um valor inteiro Y: ");
        y = valor.nextInt();
        if (x == y) {
            System.out.println("os valores sao iguais.");
        } else {
            System.out.println("os valores sao diferentes.");
        }
        valor.close();
    }
}
