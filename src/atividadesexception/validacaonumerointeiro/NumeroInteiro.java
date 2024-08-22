package atividadesexception.validacaonumerointeiro;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroInteiro {
    public void numeroInteiro() {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Entre com um valor inteiro:");
            String valor = sc.nextLine();
            if (valor.matches("[a-zA-Z]+")) {
                System.out.println("Você digitou uma letra, só é permitido números");
            } else {
                int numero = Integer.parseInt(valor);
                System.out.println("Obrigado por digitar o numero inteiro : " + numero);
            }


        } catch (NumberFormatException e) {

            System.out.println("\nATENÇÃO o valor digitado deve ser inteiro");

        } finally {
            sc.close();
        }


    }


}





