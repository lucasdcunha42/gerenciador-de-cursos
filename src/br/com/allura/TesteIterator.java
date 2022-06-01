package br.com.allura;

import java.util.*;

public class TesteIterator {
    public static void main(String[] args) {
        List<String> letras = new LinkedList<>();
        letras.add("A");
        letras.add("B");
        letras.add("C");

//        letras.forEach(letra ->{
//            System.out.println(letra);
//        });
        Iterator<String> iterator = letras.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
