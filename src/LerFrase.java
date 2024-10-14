package operadoresaritmeticos;

import java.util.Scanner;

public class LerFrase {
    // Crie um algoritmo que leia uma frase do usuário e escreva na tela exatamente o que o usuário digitar
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase :");
        String frase = sc.next() + sc.nextLine();

        System.out.println("A frase digitada é: " + frase);

        sc.close();

    }




}
