package com.serratecpoo;

public class Avaliacao {

    private Disciplina disciplina;
    private Estudante estudante; 
    private Professor professor;
    private double notaFinal;
    private int quantidadeAval = 0;
    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;
    private double nota5;

    // Construtor com parâmetros(this)
    public Avaliacao(Estudante estudante, Disciplina disciplina, Professor professor) {
        this.estudante = estudante;
        this.disciplina = disciplina;
        this.professor = professor;
    }

    // Getters e Setters
    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Estudante getEstudante() {
        return estudante;
    }

    public void setEstudante(Estudante estudante) {
        this.estudante = estudante;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getNota5() {
        return nota5;
    }

    public void setNota5(double nota5) {
        this.nota5 = nota5;
    }

    // Método para calcular a nota final
    public double calcularNotaFinal() {
        double somaNotas = nota1 + nota2 + nota3 + nota4 + nota5;
        quantidadeAval = 5; // Define o número de avaliações como 5 (ajuste conforme necessário)
        notaFinal = somaNotas / quantidadeAval;
        return notaFinal;
    }
    
    // Método estático para receber o ID do estudante (se necessário)
    public static void recebeIdEstudante(Estudante estudante) {

    }
}
