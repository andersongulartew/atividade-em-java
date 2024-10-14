package operadoresaritmeticos;

import java.util.Scanner;

public class IdadeEmDias {
    public static void main(String[] args) {
        //Crie um algoritmo que leia uma idade de uma pessoa e calcule quantos dias essa pessoa já viveu

        Scanner ler = new Scanner(System.in);

        // MODELO 1
//        int ano_nascimento;
//        int ano_atual;
//        System.out.println("Digite o ano do atual: ");
//        ano_atual = ler.nextInt();
//        System.out.println("Digite o ano do seu nascimento: ");
//        ano_nascimento = ler.nextInt();
//
//        int idadeEmAnos = ano_atual - ano_nascimento;
//        int idadeEmDias = idadeEmAnos*365;
//        System.out.println("Sua idade em dias é: " + idadeEmDias);

        // MODELO 2
        int idade;
        int dias;

        System.out.println("Quanto anos você tem ?");
        idade = ler.nextInt();

        dias = idade * 365;
        System.out.println("Você já viveu " + dias + " dias");

        ler.close();

    }
}
