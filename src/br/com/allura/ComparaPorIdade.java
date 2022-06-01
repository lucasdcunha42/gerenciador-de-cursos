package br.com.allura;

import java.util.Comparator;

public class ComparaPorIdade implements Comparator<Funcionario> {

    @Override
    public int compare(Funcionario f1, Funcionario f2) {
        return f1.getIdade() - f2.getIdade();
    }
}
