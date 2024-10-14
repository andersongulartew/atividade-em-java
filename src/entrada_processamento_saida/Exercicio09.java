package entrada_processamento_saida;

import java.util.Scanner;

public class Exercicio09 {
/*    9) Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e
        dias e escreva a idade dessa pessoa expressa apenas em dias.*/
    public static void main(String[] args) {
        System.out.println("Vamos representar sua idade em dias.");
        Scanner sc = new Scanner(System.in);
        int anoAtual,anoNascimento, idadeEmAnos;
        double idadeEmDias;

        System.out.println("Por favor, digite o ano atual");
        anoAtual = sc.nextInt();
        System.out.println("Por favor, digite o ano nascimento");
        anoNascimento = sc.nextInt();

        idadeEmAnos = anoAtual - anoNascimento;
        idadeEmDias = idadeEmAnos * 365;

        System.out.println("Voce tem " + idadeEmAnos + " anos");
        System.out.println("Você possui " + idadeEmDias + " dias de vida");

        sc.close();


    }

}
