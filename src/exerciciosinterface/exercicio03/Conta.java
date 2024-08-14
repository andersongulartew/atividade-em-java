package exerciciosinterface.exercicio03;

public abstract class Conta {
    private String titular;
    private int numConta;
    private double saldo;

    public Conta(String titular, int numConta, double saldo) {
        this.setTitular(titular);
        this.setNumConta(numConta);
        this.setSaldo(saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double obterSaldo(){
        return this.saldo;
    }

    public void sacar(double valor) {
        if(this.obterSaldo() >= valor){
            this.setSaldo(saldo - valor);
            System.out.println("Saque realizado!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void depositar(double valor) {
        this.setSaldo(saldo + valor);
        System.out.println("Depósito realizado!");
    }
}
