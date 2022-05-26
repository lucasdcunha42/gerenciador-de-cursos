package br.com.allura;

import java.util.*;

public class TestaCurso2 {
    public static void main(String[] args) {

        Curso javaCollections = new Curso("Aprendendo Collections", "Lucas Cunha");
//        List<Aula> aulas = javaCollections.getAulas();
//        System.out.println(aulas);
//        javaCollections.getAulas().add(new Aula("Trabalhando com Arrays", 21));

        javaCollections.adciona(new Aula("Trabalhando com Arrays", 21));
        javaCollections.adciona(new Aula("Trabalhando Listas", 22));
        javaCollections.adciona(new Aula("Trabalhando Matriz", 23));

        List<Aula> aulasImutaveis = javaCollections.getAulas();
        System.out.println("Aulas Desordenadas: " + aulasImutaveis);
        System.out.println("--------------------------");

        List<Aula> aulas = new ArrayList<>(aulasImutaveis);
        Collections.sort(aulas);
        System.out.println("Aulas em Ordem Alfabetica: " + aulas);
        System.out.println("--------------------------");

        System.out.println(javaCollections);
        System.out.println(javaCollections.getAlunos());
        Aluno a1 = new Aluno("Flavio", 123);
        Aluno a2 = new Aluno("Rodrigo", 231);
        Aluno a3 = new Aluno("Livia", 312);
        System.out.println("--------------------------");

        javaCollections.matricula(a1);
        javaCollections.matricula(a2);
        javaCollections.matricula(a3);
        System.out.println(javaCollections.getAlunos());
        System.out.println("--------------------------");

        javaCollections.getAlunos().forEach(aluno -> {
            System.out.println(aluno);
        });

        Set<Aluno> alunos = javaCollections.getAlunos();


    }
}
