package src.descontosalario;

import src.descontosalario.DescontosParaSeremAplicados;

import java.util.Scanner;

public class DescontoAplicados implements DescontosParaSeremAplicados {
    double valorPorHora;
    double quantidadeHorasTrabalhadas;
    double quantidadeDiasTrabalhados;

    public DescontoAplicados(double valorPorHora, double quantidadeHorasTrabalhadas, double quantidadeDiasTrabalhados) {
        this.valorPorHora = valorPorHora;
        this.quantidadeHorasTrabalhadas = quantidadeHorasTrabalhadas;
        this.quantidadeDiasTrabalhados = quantidadeDiasTrabalhados;
    }
    @Override
    public double salarioBruto() {
        return valorPorHora * quantidadeHorasTrabalhadas * quantidadeDiasTrabalhados;

    }
    @Override
    public double descontoINSS() {
        return salarioBruto() * 0.11f;
    }
    @Override
    public double descontoSindicato() {
        return salarioBruto() * 0.08f;
    }
    @Override
    public double descontoImpostoRenda() {
        return salarioBruto() * 0.05f;
    }
    @Override
    public double salarioLiquido() {
        return salarioBruto() - descontoINSS() - descontoSindicato() - descontoImpostoRenda();
    }

}
