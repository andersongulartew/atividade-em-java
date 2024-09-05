package exerciciosjava.entrada_processamento_saida;

import java.util.Scanner;

public class ComissaoVendedores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;double codigo, preco, qntdVendida, Porcentagemcomissao = 0.05;

        System.out.println("Informe o nome do Vendedor:");
        nome = sc.nextLine();
        System.out.println("Informe o código da peça");
        codigo = sc.nextDouble();
        System.out.println("Qual o Preço por peça ? ");
        preco = sc.nextDouble();
        System.out.println("Qual a quantidade de vendida? ");
        qntdVendida = sc.nextDouble();


        double valor_comissao = (qntdVendida * preco) * Porcentagemcomissao;
        double valor_total = (qntdVendida * preco) + valor_comissao;

        System.out.println("O valor da comissão é : " + valor_comissao);
        System.out.println("Sr.(a) " + nome + ", receberá o total de : " + valor_total );


    }
}
