package condicoes;

import java.util.Scanner;

public class QuantidadesDeParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminou = false;
        int n;
        int p = 0;
        int i = 0;
        while (true) {
            System.out.println("Digite um numero inteiro, ou zero(0) para terminar: ");
            n = scanner.nextInt();
            if (n == 0) {
                terminou = true;
                break;
            } else {
                if (n % 2 == 0) {
                    p = p + 1;
                } else {
                    i = i + 1;
                }
            }
        }
        System.out.println("Par = " + p);
        System.out.println("Impar = " + i);
    }
}
