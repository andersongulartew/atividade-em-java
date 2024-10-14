package entrada_processamento_saida;

import java.util.Scanner;

public class Exercicio08 {
    /*8) Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
    V = 3.14159 * R * R * A
    Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double raio;
        double altura;
        double volume;

        System.out.println("Por favor, digite o diâmetro da lata (em cm) :");
        raio = sc.nextDouble() / 2;

        System.out.println("Digite a altura da lata (em cm): ");
        altura = sc.nextDouble();

        volume = Math.PI * raio * raio * altura;

        System.out.print("\n O volume da lata é de " + volume + " cm³\n");
    }
}
