package exerciciosjava.operadoresaritmeticos;

import java.util.Scanner;

public class Multiplicacao {
 //Crie um algoritmo que lê dois números inteiros, X e Y, e mostre o resultado da multiplicação de x por y
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor x :");
        int x = sc.nextInt();

        System.out.println("Digite um valor y:");
        int y = sc.nextInt();

        int result = x * y;
        System.out.println("O resultado da multiplicação é: " + result);
    }
}
