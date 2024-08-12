package exercicio03;

import exercicio02.Tributavel;

public class ContaCorrente extends Conta implements Tributavel {

    public ContaCorrente(String titular, int numConta, double saldo) {
        super(titular, numConta, saldo);
    }

    @Override
    public double calcularTributos() {
        return this.obterSaldo() * 0.01;
    }

    @Override
    public String toString() {
        return "**CONTA CORRENTE**" + "\n" +
                "Titular: " + this.getTitular() + "\n" +
                "Nº da Conta: " + this.getNumConta() + "\n" +
                "Saldo: R$ " + this.obterSaldo() + "\n";

    }
}
