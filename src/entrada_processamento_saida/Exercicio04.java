package entrada_processamento_saida;

import java.util.Scanner;

public class Exercicio04 {
 public static void main(String[] args) {
/*       4) Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
  	valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
  	A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
 	com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
  	devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
  	multiplicações.*/

        Scanner entrada = new Scanner(System.in);
        int[] valores = new int[4];


        for (int i = 0; i < 4; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
        }

        System.out.println("\nResultados:\n");

        for (int i = 0; i < valores.length - 1; i++) {
            for (int j = i + 1; j < valores.length; j++) {
                System.out.println("Valores " + (i + 1) + " e " + (j + 1) + ":");
                System.out.println("    " + valores[i] + " + " + valores[j] + " = " + (valores[i] + valores[j]));
                System.out.println("    " + valores[i] + " * " + valores[j] + " = " + (valores[i] * valores[j]) + "\n");
            }
        }

        entrada.close();
    }
}
