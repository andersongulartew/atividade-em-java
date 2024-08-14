package exerciciosinterface.exercicio03;

public class SeguroDeVida implements Tributavel {
    private String titular;
    private int numApolice;
    private double valor;

    public SeguroDeVida(String titular, int numApolice, double valor) {
        this.setTitular(titular);
        this.setNumApolice(numApolice);
        this.setValor(valor);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumApolice() {
        return numApolice;
    }

    public void setNumApolice(int numApolice) {
        this.numApolice = numApolice;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcularTributos() {

        return 42.00;
    }

//    public void tributar() {
//        this.setValor(this.valor - this.calcularTributos());
//    }

    @Override
    public String toString() {
        return "**SEGURO DE VIDA**" + "\n" +
                "Titular: " + this.getTitular() + "\n" +
                "Nº da Apólice: " + this.getNumApolice() + "\n" +
                "Valor: R$ " + this.getValor() + "\n";

    }
}
