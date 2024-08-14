package exerciciosjava.operadoresaritmeticos;

import java.util.Scanner;

public class Divisao {
//Crie um algoritmo que lê dois números, X e Y, e mostra o resultado da divisão entre eles
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor x :");
        int x = sc.nextInt();

        System.out.println("Digite um valor y:");
        int y = sc.nextInt();

        int result = x / y;
        System.out.println("O resultado da multiplicação é: " + result);
    }
}
