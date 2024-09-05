package exerciciosjava.entrada_processamento_saida;

import java.util.Scanner;

public class CombustivelGastoNaViagem {
    /*****************************************************************************************************************
* 5) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
* 	12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
* 	Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
* 	Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
* 	fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
* 	tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*****************************************************************************************************************/
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double tempo, velocidade, litrosUsados, distancia;

        System.out.println("Por favor, digita o tempo que você gastou em sua viagem (horas): ");
        tempo = entrada.nextDouble();

        System.out.println("or favor, agora digite o Velocidade Média em que você fez o percurso (Km/h): ");
        velocidade = entrada.nextDouble();

        distancia = tempo * velocidade;
        litrosUsados = distancia / 12;

        System.out.print("\n\n\nResultados:\n\n");
		System.out.print("Velocidade média = " + velocidade + " Km/h\n");
		System.out.print("Tempo gasto = " + tempo + " horas\n");
		System.out.print("Distancia Percorrida = " + distancia + " Km\n");
		System.out.print("Quantidade de Combustível utilizado: " + litrosUsados + " litros\n");

    }


}
