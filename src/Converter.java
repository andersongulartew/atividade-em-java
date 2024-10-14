package operadoresaritmeticos;

import java.util.Scanner;

public class Converter {
//Crie um algoritmo que faça conversão de dolar para real e vice-versa.
// Considere que a cotação é US$ 1 = R$ 5,35.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha o valor para conversão: ");
        System.out.println("1 - Reais para Dólar");
        System.out.println("2 - Dólar para Reais");
        int opcao = sc.nextInt();

        System.out.println("Informe o valor : ");
        double valores = sc.nextDouble();

        double valorConvertido;

        switch (opcao) {
            case 1:
                valorConvertido = valores / 5.35;
                System.out.println("Valor em dólar: " + valorConvertido);
                break;
            case 2:
                valorConvertido = valores * 5.35;
                System.out.println("Valor em reais: " + valorConvertido);
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

    }
}
