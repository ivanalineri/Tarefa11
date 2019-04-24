package br.com.digitalhouse;

import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        int idade1;
        int idade2;
        int idade3;
        String nome1;
        String nome2;
        String nome3;

        System.out.println("Informar idade e nome da primeira pessoa: ");
        idade1 = entrada.nextInt();
        nome1 = entrada.next();
        Scanner entrada2 = new Scanner(System.in);
        System.out.println("Primeira pessoa: " + idade1 + " " + nome1);
        System.out.println("Informar idade e nome da segunda pessoa");
        idade2 = entrada.nextInt();
        nome2 = entrada.next();
        Scanner entrada3 = new Scanner(System.in);
        System.out.println("Segunda pessoa: " + idade2 +  " " + nome2);
        System.out.println("Informar idade e nome da segunda pessoa");
        idade3 = entrada.nextInt();
        nome3 = entrada.next();
        Scanner entrada4 = new Scanner(System.in);
        System.out.println("A terceira pessoa: " + idade3 +  " " + nome3);
        if( idade1 > idade2 && idade1 > idade3){
            System.out.println("O mais velho da turma é:  " + nome1);
        }else if(idade2 > idade3 && idade2 > idade1){
            System.out.println("O mais velho da turma é:  " + nome2);
        }else {
            System.out.println("O mais velho da turma é:  " + nome3);
        }

        if( idade1 < idade2 && idade1 < idade3){
            System.out.println("O mais novo da turma é:  " + nome1);
        }else if(idade2 < idade3 && idade2 < idade1){
            System.out.println("O mais novo da turma é:  " + nome2);
        }else {
            System.out.println("O mais novo da turma é:  " + nome3);
        }

    }
}
