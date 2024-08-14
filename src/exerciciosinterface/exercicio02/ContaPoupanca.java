package exerciciosinterface.exercicio02;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(String titular, int numConta, int numero) {
        super(titular, numConta, numero);
    }

    @Override
    public String toString() {
        return "**CONTA POUPANÇA**" + "\n" +
                "Titular: " + this.getTitular() + "\n" +
                "Nº da Conta: " + this.getNumConta() + "\n" +
                "Saldo: R$ " + this.obterSaldo() + "\n" +
                "";
    }

}
