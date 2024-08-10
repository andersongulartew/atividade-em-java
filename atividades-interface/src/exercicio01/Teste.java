package exercicio01;


public class Teste {
    public static void main(String[] args) {
        AreaCalculavel[] vetor = new AreaCalculavel[5];
        vetor[0] = new Quadrado(5);
        vetor[1] = new Circulo(3);
        vetor[2] = new Retangulo(4, 5);
        vetor[3] = new Quadrado(6);
        vetor[4] = new Retangulo(7, 8);

        System.out.println("Segue as Áreas dos seguintes símbolos \n");
        for (AreaCalculavel dados : vetor) {
            System.out.println(dados.toString());
            System.out.println("-----------------------------------");
        }

    }
}
