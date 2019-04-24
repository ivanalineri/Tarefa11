package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercicio3 {
    public static void main(String[] args) {

        List<Integer> numdecrescente = new ArrayList<Integer>(100);
        for (int i = 1; i <= 100; i++) {
            numdecrescente.add(i);

        }
        Collections.reverse(numdecrescente);

        System.out.println(numdecrescente);

    }
}
