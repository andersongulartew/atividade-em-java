Package src.descontopostocombustivel;

import java.util.Scanner;

public class Abastecimento {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("O Valor da Gasolina é 2.50L e o valor do Ácool é 1.90L, que deseja abastecer?");
        System.out.println("Gasolina :\nAté de 20L desconto de 4% por litro \nAcima 20L desconto de 6% por litro");
        System.out.println("Álcool :\nAté de 20L desconto de 3% por litro\nAcima de até 20L desconto de 5% por litro");
        System.out.println("Gasolina_digite G / Álcool_digite A");
        char escolha = entrada.next().toUpperCase().charAt(0);
        System.out.println("Quantos litro deseja abastecer? ");
        double litro = entrada.nextDouble();

        double gasolina = 2.50;
        double alcool = 1.90;
        double valorPago = 0;

        switch (escolha) {
            case 'G':
                if (litro <= 20) {
                    valorPago = litro * (gasolina - (gasolina * 0.04));
                } else {
                    valorPago = litro * (gasolina - (gasolina * 0.06));
                }
                break;
            case 'A':
                if (litro <= 20) {
                    valorPago = litro * (alcool - (alcool * 0.03));
                } else {
                    valorPago = litro * (alcool - (alcool * 0.05));
                }
                break;
            default:
                System.out.println("opção invalida");
        }

        System.out.println("O valor a ser pago é: " + valorPago);


    }


}
