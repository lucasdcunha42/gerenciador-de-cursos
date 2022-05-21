package br.com.allura;

import java.util.HashSet;
import java.util.Set;

public class TestaAlunos {
    public static void main(String[] args) {
        Set<String> alunos = new HashSet<>();
        alunos.add("Paulo");
        alunos.add("Lucas");
        alunos.add("Rodrigo");
        alunos.add("Renato");

        System.out.println(alunos.size());

        boolean adicionou = alunos.add("Valmir");

        alunos.forEach(a ->{
            System.out.println(a);
        });

        System.out.println("o aluno foi adcionado? " + adicionou);
        System.out.println(alunos.size());
    }
}
