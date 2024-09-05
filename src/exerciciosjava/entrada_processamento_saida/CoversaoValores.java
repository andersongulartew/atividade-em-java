package exerciciosjava.entrada_processamento_saida;

import java.util.Scanner;

public class CoversaoValores {
    public static void main(String[] args) {

    /*  2) Faça um programa que:
    Leia a cotação do dólar
    Leia um valor em dólares
    Converta esse valor para Real
    Mostre o resultado*/

        Scanner sc = new Scanner(System.in);

        System.out.println("Qual é a cotação do dólar hoje ?");
        double cotacao = sc.nextDouble();
        System.out.println("Agora Insira um valor para ser convertido em real:");
        double valor = sc.nextDouble();

        double conversao = cotacao * valor;

        System.out.println("Valor em Reais : " + conversao);
    }
}
