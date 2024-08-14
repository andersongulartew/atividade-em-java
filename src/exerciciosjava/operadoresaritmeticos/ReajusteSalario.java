package exerciciosjava.operadoresaritmeticos;

import java.util.Scanner;

public class ReajusteSalario {
    public static void main(String[] args) {
        Scanner salario = new Scanner(System.in);

        double salarioAtual,reajuste;
        double salarioFinal;

        System.out.println("Por favor, digite o seu Salário Atual :");
        salarioAtual = salario.nextDouble();
        reajuste = salarioAtual * 0.07;
        salarioFinal = salarioAtual + reajuste;
        System.out.println("Seu salario foi reajustado em 7% e aumento R$ " + String.format("%.2f", reajuste) + " ,ficou no total de : R$" + String.format("%.2f", salarioFinal));

        salario.close();
    }
}
