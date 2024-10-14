package operadoresaritmeticos;

import java.util.Scanner;

public class DadosDeUsuario {
    // Crie um algoritmo que solicite o nome, o endereço
    // e o telefone do usuário e depois mostra os dados digitados em uma única linha.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome,endereco,telefone;
        System.out.println("Por favor Digitar seu nome:");
        nome = sc.nextLine();

        System.out.println("Por favor Digitar seu endereço:");
        endereco = sc.nextLine();

        System.out.println("Por informe seu telefone com o DDD :");
        telefone = sc.nextLine();

        sc.close();
        System.out.println("Nome: " + nome + "\nEndereço: "+ endereco + "\nTelefone: " + telefone);


    }
}
