package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {

        Scanner entrada  = new Scanner(System.in);
        int numero = 0;
        int antecessor = 0;
        int sucessor = 0;

        System.out.println("Informe um numero");
        numero = entrada.nextInt();
        sucessor = numero + 1;
        antecessor = numero -1;

        System.out.println("O número informado é " + numero);
        System.out.println("O sucessor é " + sucessor);
        System.out.println("O antecessor é " + antecessor);



    }
}
