package exercicio03;

public class TestarGerenciadorDeImpostoDeRenda {
    public static void main(String[] args) {
        GerenciadorDeImpostoDeRenda tributos = new GerenciadorDeImpostoDeRenda();
        ContaCorrente cc = new ContaCorrente("Sr. Wilson", 1, 750.00);
        SeguroDeVida sv = new SeguroDeVida("Sr. Freitas", 2, 500.00);

        System.out.println("Mostrando os tributáveis de uma pessoa: ");
        System.out.println("");
        System.out.println(cc.toString());
        System.out.println(sv.toString());

        System.out.println("Calculando os tributos...");
        System.out.println("");
        tributos.adicionarTributavel(cc);
        tributos.adicionarTributavel(sv);

        System.out.println("Tributável da Conta Corrente: R$ " + cc.calcularTributos());
        System.out.println("Tributável do Seguro de Vida: R$ " + sv.calcularTributos());
        System.out.println("Total da soma dos tributos: R$ " + tributos.getTotalTributaveis());
        System.out.println("");
    }
}
