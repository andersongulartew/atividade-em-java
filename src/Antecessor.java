package operadoresaritmeticos;

import java.util.Scanner;

public class Antecessor {
    public static void main(String[] args) {
        //Crie um algoritmo que leia um número inteiro e mostre seu antecessor

        Scanner sc = new Scanner(System.in);
        int numero,antecessor;

        System.out.println("Digite um numero: ");
        numero = sc.nextInt();

        antecessor = numero + 1;

        System.out.println("O sucessor do " + numero + " é " + antecessor);


    }
}
