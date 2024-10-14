package entrada_processamento_saida;

import java.util.Scanner;

public class Exercicio03 {
/*    3) Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida*/
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
