package com.serratecpoo;

import java.time.LocalDate;

public class Estudante extends Pessoa {
    private static int contadorIdEstudante = 1000;
    private int idEstudante;
    private String dataMatricula;

    // Construtor padrão - sem parâmetros
    public Estudante() {
        super();
        geraIdEstudante();
    }

    public Estudante(String nomePessoa, String cpf, String dataNascimento, String email, String telefone) {
        super(nomePessoa, cpf, dataNascimento, email, telefone);
        this.dataMatricula = LocalDate.now().toString();
        geraIdEstudante();
    }

    // Getters e Setters
    public int getIdEstudante() {
        return idEstudante;
    }

    public String getDataMatricula() {
        return dataMatricula;
    }

    // Método para gerar o ID de forma automática
    private void geraIdEstudante() {
        this.idEstudante = ++contadorIdEstudante;
    }

    // Método para exibir os dados do estudante
    public void imprimeFichaAluno() {
        System.out.println("========DADOS DO ALUNO:==========");
        System.out.println("NOME: " + getNomePessoa());
        System.out.println("ID: " + getIdEstudante());
        System.out.println("DATA DE MATRÍCULA: " + getDataMatricula());
    }
}
