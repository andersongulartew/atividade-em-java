package src.condicoes;

import java.util.Scanner;

public class MasculinoFeminino {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Inform seu sexo usando (M para masculino / F para feminino) : ");
        String sexo = entrada.nextLine();

        if (sexo.equals("F")) {
            System.out.println("Seja bem-vinda, Senhora!");
        }else{
            System.out.println("Seja bem-vindo, Senhor!");
        }
        entrada.close();
    }
}
