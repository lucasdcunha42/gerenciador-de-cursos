package br.com.allura;

import java.util.*;

public class Curso {

    private String nome;
    private String instrutor;
    private List<Aula> aulas = new ArrayList<>();
    private Set<Aluno> alunos = new HashSet<>();

    public Curso(String nome, String instrutor) {

        this.nome = nome;
        this.instrutor = instrutor;
    }

    public String getNome() {
        return nome;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public void adciona(Aula aula){
        this.aulas.add(aula);
    }

    public int getTempoTotal(){
        return this.aulas.stream().mapToInt(Aula::getTempo).sum();
    }

    @Override
    public String toString() {
        return "Curso: " + this.nome + ", tempo total: " + getTempoTotal() +
                " minutos, Aulas: " + this.aulas;
    }
    protected void matricula(Aluno aluno) {
        this.alunos.add(aluno);
    }
    public Set<Aluno> getAlunos() {
        return Collections.unmodifiableSet(alunos);
    }

    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }
}
