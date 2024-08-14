package exerciciosjava.operadoresaritmeticos;

import java.util.Scanner;

public class Sucessor {
    public static void main(String[] args) {
        //Crie um algoritmo que leia um número inteiro e mostre seu sucessor

        Scanner sc = new Scanner(System.in);
        int numero,sucessor;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        sucessor = numero + 1;

        System.out.println("O sucessor do " + numero + " é " + sucessor);


    }
}
