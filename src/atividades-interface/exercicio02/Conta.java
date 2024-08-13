package exercicio02;

public abstract class Conta {
    private String titular;
    private int numConta;
    private double saldo;

    public Conta(String titular, int numConta, double saldo) {
        this.titular = titular;
        this.numConta = numConta;
        this.saldo = saldo;
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

    public double obterSaldo() {
        return this.saldo;
    }

    public void sacar(double valor) {
        if(this.obterSaldo() >= valor){
            this.setSaldo(saldo - valor);
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    public void depositar(double valor) {
        this.setSaldo(saldo + valor);
        System.out.println("Deposito realizado com sucesso!");
    }
}
