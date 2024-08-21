package atividadesexception.autorizacaodirigir;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InformacoesUsuario {
//    Considere um programa que coleta informações de um usuário,
//    como nome, idade e se possui CNH (Carteira Nacional de Habilitação).
//    O programa deve validar essas informações e fornecer uma autorização para dirigir com base
//    na idade e no status da CNH.

    private int idade;
    private String nome;
    private String cnh;

    public void dadosUsuario() {
        Scanner entrada = new Scanner(System.in);
        boolean entradaValida = false;
        while (!entradaValida) {
            try {
                System.out.println("Digite seu nome: ");
                nome = entrada.nextLine();
                System.out.println("Digite sua idade: ");
                idade = entrada.nextInt();
                entrada.nextLine();
                System.out.println("Você possui CNH? sim/nao");
                cnh = entrada.nextLine();
                if (!cnh.equalsIgnoreCase("sim") && !cnh.equalsIgnoreCase("nao")) {
                    throw new IllegalArgumentException("Resposta inválida. Por favor, responda 'sim' ou 'não' para a CNH, preencha novamente.");
                }
                entradaValida = true;
            } catch (InputMismatchException e) {
                System.out.println("Idade inválida,preencha os dados novamente ");
                entradaValida = false;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                entradaValida = false;
            }
        }
        entrada.close();
    }

    public void autorizacao() {
        if (idade <= 17) {
            System.out.println(nome + "," + " você é menor de idade, não pode dirigir");
        } else if ((idade >= 18 && idade <= 70) && cnh.equals("sim")) {
            System.out.println(nome + "," + " Você pode dirigir");
        } else if ((idade >= 18 && idade <= 70) && cnh.equals("nao")) {
            System.out.println(nome + "," + " Você não pode dirigir");
        } else {
            System.out.println(nome + "," + " Você esta proibido devido a sua idade de: " + idade + " anos");
        }
    }


}
