package condicoes;

import java.util.Scanner;

public class ValorMaior {
    public static void main(String[] args) {
        Scanner valor = new Scanner(System.in);
        int num1, num2;
        System.out.println("Vamos verificar se os valores sao iguais.");
        System.out.println("Digite um valor inteiro : ");
        num1= valor.nextInt();
        System.out.println("Digite outro valor inteiro : ");
        num2= valor.nextInt();
        if (num1 > num2) {
            System.out.println("O valor" + num1 + "é o maior");
        } else if(num2 > num1){
            System.out.println("O valor " + num2 + "é o maior");
        }else{
            System.out.println("Os dois valores sao iguais");
        }
        valor.close();

    }
}
