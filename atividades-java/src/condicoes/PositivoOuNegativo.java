package src.condicoes;

import java.util.Scanner;

public class PositivoOuNegativo {
    // Crie um algoritmo que leia um número do usuário e informe se e o número é positivo ou negativo.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int n = sc.nextInt();
        if (n > 0) {
            System.out.println("O numero  " + n + ", é positivo");
        } else if (n < 0) {
            System.out.println("O numero  " + n + ", é negativo");
        } else {
            System.out.println("O número digitado foi zero");
        }

        sc.close();
    }
}
