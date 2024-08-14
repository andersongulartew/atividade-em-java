package exerciciosjava.condicoes;

import java.util.Scanner;

public class Tempatura {
    public static void main(String[] args) {
      /*  Crie um algoritmo que, dada uma temperatura em graus célsius,
        exiba uma mensagem informando o tipo do clima, de acordo com as seguintes condições:
        se a temperatura estiver até 18 graus, o clima é frio;
        se a temperatura estiver entre 19 e 23 graus, o clima é agradável;
        se a temperatura estiver entre 24 e 35 graus, o clima é quente;
        se a temperatura estiver acima de 35 graus, o clima é muito quente.*/

        Scanner entrada = new Scanner(System.in);
        System.out.println("Quantos graus Celsius esta fazendo hoje ?");
        Integer grausCelsius = entrada.nextInt();

        if (grausCelsius <= 18) {
            System.out.println("O clima está muito frio.");
        }else if (grausCelsius <=23) {
            System.out.println("O clima está agradável");
        }else if (grausCelsius <=35) {
            System.out.println("O clima está  quente");
        }else{
            System.out.println("O clima está muito quente");
        }
    }
}
