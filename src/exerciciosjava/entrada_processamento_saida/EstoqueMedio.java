package exerciciosjava.entrada_processamento_saida;

import java.util.Scanner;

public class EstoqueMedio {
    /*Faça um programa para calcular o estoque médio de uma peça, sendo que:
    ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.*/

    public static void main(String[] args) {
        System.out.println("Verificação de Estoque");
        Scanner entrada = new Scanner(System.in);
        double qntd_minima;double qntd_maxima;

        System.out.println("Digite a quantidade minima do estoque: ");
        qntd_minima = entrada.nextDouble();
        System.out.println("Digite a quantidade máxima do estoque: ");
        qntd_maxima = entrada.nextDouble();

        double estoque_medio = (qntd_minima + qntd_maxima)/2;
        System.out.println("Estoque Médio é : " + estoque_medio);

    }
}
