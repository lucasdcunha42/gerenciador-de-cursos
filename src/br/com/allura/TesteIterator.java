package br.com.allura;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TesteIterator {
    public static void main(String[] args) {
        Set<Aluno> alunos = new HashSet<>();
        Iterator<Aluno> iterator = alunos.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
