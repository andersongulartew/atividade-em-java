package src.operadoresaritmeticos;

import java.util.Scanner;

public class AreaTriangulo {

    // calcula a area de um triangulo

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("digite a base: ");
        float base = sc.nextFloat();

        System.out.println("digite a altura: ");
        float altura = sc.nextFloat();


        System.out.println("A area do trinagulo é: " + (base * altura / 2) + "cm");


    }
}
