package br.com.allura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class TestaPerformace {

    public static void main(String[] args) {
        Collection<Integer> numeros = new HashSet<Integer>();
//        Collection<Integer> numeros = new ArrayList<Integer>();


        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 50000; i++) {
            numeros.add(i);
        }
        for (Integer numero : numeros) {
            numeros.contains(numero);
        }

        long fim = System.currentTimeMillis();

        long fimDaExecucao = fim - inicio;

        System.out.println("O tempo de Exxecução é : " + fimDaExecucao);
    }
}
