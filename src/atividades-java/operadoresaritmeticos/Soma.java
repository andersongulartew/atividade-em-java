package src.operadoresaritmeticos;

import java.util.Scanner;

public class Soma {
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o primeiro número:");
            double num1 = scanner.nextDouble();

            System.out.println("Digite o segundo número:");
            double num2 = scanner.nextDouble();

            double resultado = num1 + num2;
            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja fazer outra conta de adição? (s/n):");
            String resposta = scanner.next();

            if (!resposta.equalsIgnoreCase("s")) {
                continuar = false;
            }
        }

        System.out.println("Programa encerrado.");
        scanner.close();
    }
}
