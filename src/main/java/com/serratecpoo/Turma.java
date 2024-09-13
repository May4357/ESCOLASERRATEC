package com.serratecpoo;
import java.util.ArrayList;
public class Turma {


    private int idTurma=2024;
    private int contadorTurma=0;
    private ArrayList<Estudante> listaEstudantes;
    private Disciplina nomeDisciplinas;
   

//Construtor sem parâmetros(this):

public Turma(){ // aqui , criei as duas listas vazias. 
    this.idTurma=gerarIdTurma();
    this.listaEstudantes=new ArrayList<>();


}
public void adicionaALuno(Estudante estudante){
    this.listaEstudantes.add(estudante);

}

public int  gerarIdTurma(){ //método gera o id das turmas 
    contadorTurma++;
    return (idTurma)+contadorTurma;

}



//Getters e Setters
    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public int getContadorTurma() {
        return contadorTurma;
    }

    public void setContadorTurma(int contadorTurma) {
        this.contadorTurma = contadorTurma;
    }

    
    public ArrayList<Estudante> getListaEstudantes() {
        return listaEstudantes;
    }

    public void setListaEstudantes(ArrayList<Estudante> listaEstudantes) {
        this.listaEstudantes = listaEstudantes;
    }
    
    public Disciplina getNomeDisciplinas() {
        return nomeDisciplinas;
    }

    public void setNomeDisciplinas(Disciplina nomeDisciplinas) {
        this.nomeDisciplinas = nomeDisciplinas;
    }
    



//criar array turma ok
//criar um array para armazenar os alunos na turma ok
//método para exibir os alunos  da turma 


//método de exibir os dados da turma 
public void  dadosTurma(){

    System.out.println("=========>DADOS DA TURMA<==========");
    System.out.println("NÚMERO DA TURMA: "+getIdTurma());
    System.out.println("LISTA DE ESTUDANTES MATRICULADOS "+ getListaEstudantes());
    


    }




}
