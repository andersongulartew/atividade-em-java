package exerciciosjava.exercicioclasseabstratainterface;



import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        LojaShopping loja1 = new LojaShopping("2.345.678/0001-90", "Loja Shopping Belo Horizonte", "AV:Joaquim Rocha, 87", "Marcos Souza");
        LojaShopping loja2 = new LojaShopping("2.345.678/0004-97", "Loja Shopping Piratini", "AV:Alerto Bins, 1556", "José Ramos");
        LojaShopping loja3 = new LojaShopping("2.345.678/0056-56", "Loja Shopping Macapa", "AV:Tapir Rocha, 1820", "Marta Rolim");

        ArrayList<LojaShopping> lojas = new ArrayList<>();
        lojas.add(loja1);
        lojas.add(loja2);
        lojas.add(loja3);

        // Abertura das lojas
        for (LojaShopping loja : lojas) {
            loja.registra_abertura_dia();
        }

        // Mostrar todos os dados de cada loja criada
        for (LojaShopping loja : lojas) {
            System.out.println(loja.exibirDetalhes());
            System.out.println("-------------");
        }

    }

}
