package condicoes;

import java.util.Scanner;

public class MultiploDe5 {
    public static void main(String[] args) {
        //Crie um algoritmo que receba do usuário um número qualquer e verifique se esse é múltiplo de 5.
        Scanner numero = new Scanner(System.in);

        System.out.println("Favor digitar um valor :");
        Integer num = numero.nextInt();

        if (num % 5 == 0) {
            System.out.println("O número é múltiplo de 5");
        } else {
            System.out.println("O número não é múltiplo de 5");
        }
    }
}
