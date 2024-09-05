package exerciciosjava.entrada_processamento_saida;

import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    double grausCelsius, grausFahrenheit;

        System.out.println("Por favor, informe a temperatura em graus Celsius :");
        grausCelsius = entrada.nextDouble();


        grausFahrenheit = (9 * grausCelsius + 160) / 5;

        System.out.println("O graus Celsiu informado foi: " + grausCelsius);
        System.out.println("A conversao de Celsius em Fahrenheit ficou : " + grausFahrenheit + " ºF");





    }
}
