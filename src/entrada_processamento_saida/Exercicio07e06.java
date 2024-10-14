package entrada_processamento_saida;

import java.util.Scanner;

public class Exercicio07e06 {
/*     6) Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
	temperatura a ser utilizada é F = (9 * C + 160) / 5
            E
     7) Ler uma temperatura em graus Fahrenheit e apresentá-la convertida em graus Celsius. A fórmula de conversão de
 		temperatura a ser utilizada é C = (F - 32) * 5 / 9*/

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double grausCelsius, grausFahrenheit;
        int opcao;

        System.out.println("Por favor, informe qual temperatura deseja converter :");
        System.out.println("Digite_1 : graus Celsius em Fahrenheit");
        System.out.println("Digite_2 : graus Fahrenheit em Celsius");
        opcao = entrada.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Digite a temperatura em Celsius");
                grausCelsius = entrada.nextDouble();
                grausFahrenheit = (9 * grausCelsius + 160) / 5;
                System.out.println("O graus Celsius informado foi: " + grausCelsius);
                System.out.println("A conversao de Celsius em Fahrenheit ficou : " + (String.format("%.2f",grausFahrenheit)+ " ºF"));
                break;
            case 2:
                System.out.println("Digite a temperatura em Fahrenheit ");
                grausFahrenheit = entrada.nextDouble();
                grausCelsius = (grausFahrenheit - 32) * 5 / 9;
                System.out.println("O graus Fahrenheit informado foi: " + grausFahrenheit);
                System.out.println("A conversao de  Fahrenheit em Celsius ficou : " + (String.format("%.2f",grausCelsius) + " ºF"));
                break;
            default:
                System.out.println("Opção invalida");

        }


        entrada.close();

    }
}
