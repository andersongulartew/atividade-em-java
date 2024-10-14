package operadoresaritmeticos;

import java.util.Scanner;

public class Saudacao {
    // Crie um algoritmo que leia o primeiro nome do usuário e escreva uma saudação para ele
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é seu nome ? ");
        String nome = sc.next();

        System.out.println("Olá, " + nome + "! Bem-vindo(a)!");

        sc.close();
    }
}
