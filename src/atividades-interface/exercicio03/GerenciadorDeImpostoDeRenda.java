package exercicio03;

public class GerenciadorDeImpostoDeRenda {

    private double totalTributaveis = 0;

    public void adicionarTributavel(Tributavel tributavel) {
        this.setTotalTributaveis(this.getTotalTributaveis() + tributavel.calcularTributos());
    }

    public double getTotalTributaveis() {
        return totalTributaveis;
    }

    public void setTotalTributaveis(double totalTributaveis) {
        this.totalTributaveis = totalTributaveis;
    }
}

