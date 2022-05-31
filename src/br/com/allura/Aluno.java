 package br.com.allura;

import java.util.Objects;

public class Aluno {

    private String nome;
    private Integer numeroMatricula;

    public Aluno (String nome, Integer numeroMatricula) throws NullPointerException {
        if (this.nome == null ){
            throw new NullPointerException("Nome não pode ser nulo");
        }
        this.nome = nome;
        this.numeroMatricula = numeroMatricula;
    }

    public String getNome() {
        return nome;
    }

    public Integer getNumeroMatricula() {
        return numeroMatricula;
    }

    @Override
    public String toString() {
        return "Aluno: " + getNome() + ", Matricula: " + getNumeroMatricula();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(numeroMatricula, aluno.numeroMatricula);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numeroMatricula);
    }

    //    @Override
//    public boolean equals(Object o) {
//       Aluno outroAluno = (Aluno) o;
//       return this.nome.equals(outroAluno.nome);
//    }
//
//    @Override
//    public int hashCode() {
//        return this.nome.hashCode();
//    }
}
