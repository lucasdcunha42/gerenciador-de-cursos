package br.com.allura;

import java.util.Set;
import java.util.TreeSet;

public class TesteTreeSet {

    public static void main(String[] args) {
        Recibo r1 = new Recibo();
        Recibo r2 = new Recibo();
        Recibo r3 = new Recibo();

        Set<Recibo> listaRecibos = new TreeSet<>();
        listaRecibos.add(r1);
        listaRecibos.add(r2);
        listaRecibos.add(r3);
    }

}

