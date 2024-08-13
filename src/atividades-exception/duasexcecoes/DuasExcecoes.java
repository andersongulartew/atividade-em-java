package duasexcecoes;

import javax.swing.*;

public class DuasExcecoes {
    public static void main(String[] args) {
        System.out.println("Inicio Processo.");
        Matematica matematica = new Matematica();
        int[] num1 = new int[]{10, 20, 30, 100};
        int[] num2 = new int[]{2, 0, 4}; // faltando a posição "3" e há uma posição zero

/*        for (int i = 0; i < 4; i++) {
            try {
                matematica.dividir(num1[i], num2[i]);
                System.out.printf("Mensagem após a exceção \n");
            } catch (ArithmeticException erro) {
                // trata somente os erros aritmética, de cálculos de matemática
                System.out.println("Erro de cálculo (20/0): " + erro.getMessage());
            } catch (ArrayIndexOutOfBoundsException erro) {
                // Trata os erros relacionados ao ultrapassar tamanho do vetor
                System.out.println("Erro do vetor(tamanhos diferentes): " + erro.getMessage());
            }
            //  CADA EXCEÇÃO IRA PARA O SEU BLOCO
        }*/


        // MOSTRANDO UMA DAS EXCEÇÕES COMO AVISO NA JANELA
        for (int i = 0; i < 4; i++) {
            try {
                matematica.dividir(num1[i], num2[i]);
            } catch (ArithmeticException erro) {
                // trata somente os erros aritmética, de cálculos de matemática
                // Irá aparecer um aviso sobre o erro aritmético 20x0
                JOptionPane.showConfirmDialog(null,"Erro de cálculo: " + erro.getMessage());
            } catch (ArrayIndexOutOfBoundsException erro) {
                // Trata os erros relacionados ao ultrapassar tamanho do vetor
                System.out.println("Erro do vetor(tamanhos diferentes): " + erro.getMessage());
            }
            //  CADA EXCEÇÃO IRA PARA O SEU BLOCO
        }
        System.out.println("Fim Processo.");

    }
}

