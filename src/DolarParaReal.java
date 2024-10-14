package operadoresaritmeticos;

import java.util.Scanner;

public class DolarParaReal {
// Crie um algoritmo que lê um valor real em dólar, e converte o valor para reais.
// Considere que a cotação é US$ 1 = R$ 1,82.

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        double valorEmDolar, valorEmReal;

        System.out.print("Digite o valor em Dolar: ");
        valorEmDolar = teclado.nextDouble();
        valorEmReal = valorEmDolar * 1.82;
        System.out.print("O valor em Real é: " + valorEmReal);
    }
}
