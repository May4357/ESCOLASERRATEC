package com.serratecpoo;

import java.time.LocalDate;

public class Professor extends Pessoa{
private int idProfessor;
private String dataAdmissao;
private double salario;
private Disciplina disciplina; 
private int contadorIdProfessor=3000;


private String login;
private String senha;

// Construtor sem parâmetros -padrão
public Professor() {
    super();
    geraIdProfessor();
}

//com os parâmetros de pessoa

public Professor(String nomePessoa, String cpf, String dataNascimento, String email, String telefone) {
        super(nomePessoa, cpf, dataNascimento, email, telefone);
        this.dataAdmissao = LocalDate.now().toString();
        geraIdProfessor();
    }

// Método p gerar o ID do prof de forma automatica
private void geraIdProfessor() {
    this.idProfessor = ++contadorIdProfessor;
    }

 // Método para exibir os dados do professor
 public void imprimeFichaProfessor() {
    System.out.println("========DADOS DO PROFESSOR:==========");
    System.out.println("NOME: " + getNomePessoa());
    System.out.println("ID: " + getIdProfessor());
    System.out.println("DATA DE ADMISSÃO: " + getDataAdmissao());
}

////Getters e Setters
public int getIdProfessor() {
    return idProfessor;
}
public void setIdProfessor(int idProfessor) {
    this.idProfessor = idProfessor;
}
public String getDataAdmissao() {
    return dataAdmissao;
}
public void setDataAdmissao(String dataAdmissao) {
    this.dataAdmissao = dataAdmissao;
}
public double getSalario() {
    return salario;
}
public void setSalario(double salario) {
    this.salario = salario;
}
public Disciplina getDisciplina() {
    return disciplina;
}
public void setDisciplina(Disciplina disciplina) {
    this.disciplina = disciplina;
}
public String getLogin() {
    return login;
}
public void setLogin(String login) {
    this.login = login;
}
public String getSenha() {
    return senha;
}
public void setSenha(String senha) {
    this.senha = senha;
}


//Construtores

}
