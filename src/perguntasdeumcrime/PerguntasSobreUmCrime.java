package perguntasdeumcrime;

import java.util.Scanner;

public class PerguntasSobreUmCrime {
    public static void main(String[] args) {
        Scanner resposta = new Scanner(System.in);
        int count = 0;
        System.out.println("Telefonou para a vítima?");
        String telefonou = resposta.nextLine();
        if (telefonou.equals("sim")) count++;

        System.out.println("Esteve no local do crime?");
        String esteveNoLocal = resposta.nextLine();
        if (esteveNoLocal.equals("sim")) count++;

        System.out.println("Mora perto da vítima?");
        String moraPerto = resposta.nextLine();
        if (moraPerto.equals("sim")) count++;

        System.out.println("Devia para a vítima?");
        String divida = resposta.nextLine();
        if (divida.equals("sim")) count++;

        System.out.println("Já trabalhou com a vítima?");
        String trabalhouJuntoDaVitima = resposta.nextLine();
        if (trabalhouJuntoDaVitima.equals("sim")) count++;


        if (count == 2) {
            System.out.println("Você é suspeito(a) do crime.");
        } else if (count == 3 || count == 4) {
            System.out.println("Você é cúmplice do crime.");
        } else if (count == 5) {
            System.out.println("Você é o assassino.");
        } else {
            System.out.println("Você é inocente.");
        }
    }
}
