package descontosalario;

public interface DescontosParaSeremAplicados {

    double salarioBruto();
    double descontoINSS();
    double descontoSindicato();
    double descontoImpostoRenda();
    double salarioLiquido();


}

