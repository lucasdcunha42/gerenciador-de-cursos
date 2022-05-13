package br.com.allura;

import java.util.List;

public class TestaCurso {
    public static void main(String[] args) {

        Curso javaCollections = new Curso("Aprendendo Collections", "Lucas Cunha");
        List<Aula> aulas = javaCollections.getAulas();
        System.out.println(aulas);
//        javaCollections.getAulas().add(new Aula("Trabalhando com Arrays", 21));

        javaCollections.adciona(new Aula("Trabalhando com Arrays", 21));
        javaCollections.adciona(new Aula("Trabalhando Listas", 22));
        javaCollections.adciona(new Aula("Trabalhando Matriz", 23));

        System.out.println(javaCollections.getAulas());




    }
}
