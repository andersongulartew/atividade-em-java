package descontosalario;

import descontosalario.DescontoAplicados;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // opção 1_Utilizando Scanner e variável
        Scanner sc = new Scanner(System.in);
/*      System.out.println("Olá, tudo bem! Como você se chama ?");
        String nome = sc.nextLine();
        System.out.println("Bem vindo(a) " + nome);
        System.out.println("Digite o valor ganho por hora :");
        float valorGanhoPorHora1 = sc.nextFloat();
        System.out.println("Digite o número de horas trabalhadas durante o dia :");
        float horasTrabalhadas1 = sc.nextFloat();
        System.out.println("Digite a quantidade de dias trabalhas no mes : ");
        float diasTrabalhados1 = sc.nextInt();

        float salarioBruto1 = valorGanhoPorHora1 * horasTrabalhadas1 * diasTrabalhados1;
        float descontoImpostoDeRenda1 = salarioBruto1 * 0.11f;
        float descontoINSS1 = salarioBruto1 * 0.08f;
        float descontoSindicato1 = salarioBruto1 * 0.05f;
        float totalDesconto1 = descontoINSS1 + descontoImpostoDeRenda1 + descontoSindicato1;
        //float salarioLiquido = salarioBruto - descontoINSS - descontoImpostoDeRenda - descontoSindicato;
        float salarioLiquido1 = salarioBruto1 - totalDesconto1;
        System.out.println("Seu salário bruto é : " + salarioBruto1);
        System.out.println("Seu desconto de 11% do IR sera de : " + descontoImpostoDeRenda1);
        System.out.println("Seu desconto de 8% do INSS sera de : " + descontoINSS1 );
        System.out.println("Seus desconto de  5% do sindicato sera de : " +descontoSindicato1);
        System.out.println("Seu salário líquido é : " + salarioLiquido1+"\n");*/

        System.out.println("--------------------------------------------------------------------------------");
        // opção 2 _ utilizando a interface "DescontosParaSeremAplicados" e a classe"DescontosAplicados"
        DescontoAplicados desconto = new DescontoAplicados(5.50, 9, 22);
        System.out.println("Como você se chama ?");
        String nome1 = sc.nextLine().toUpperCase();
        System.out.println("Bem vindo(a) " + nome1);
        System.out.println(String.format("Seu salário bruto é : %.2f", desconto.salarioBruto()));
        System.out.println(String.format("Seu desconto de 11%% do IR será de : %.2f", desconto.descontoImpostoRenda()));
        System.out.println(String.format("Seu desconto de 8%% do INSS sera de : %.2f", desconto.descontoINSS()));
        System.out.println(String.format("Seus desconto de  5%% do sindicato sera de : %.2f", desconto.descontoSindicato()));
        System.out.println(String.format("Seu salário líquido é : %.2f", desconto.salarioLiquido()));

        sc.close();

    }
}
