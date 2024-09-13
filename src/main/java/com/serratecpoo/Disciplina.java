package com.serratecpoo;



public class Disciplina {
    private static int contadorDisciplina=1000;
    private String nomeDisciplina;
    private String idDisciplina;
    private EnumTurno  disciplinaTurnos;

    //criar uma disciplina : POO OK
    //criar uma disciplina: Lógica de Programação OK 
    // criar uma disciplina : Banco de Dados OK

    public enum EnumTurno  {
        MANHA("Manhã"),
        TARDE("Tarde"),
        NOITE("Noite");
    
    
    private String descricao;
    
    
        EnumTurno(String descricao){
        this.descricao=descricao;
        }
    
    public String getDescricao(){
    
        return descricao;
    }
    }
    


    //Construtor com parâmetros(this)
    public Disciplina(String nomeDisciplina,  EnumTurno disciplinaTurnos){
        
        this.nomeDisciplina=nomeDisciplina;
        this.disciplinaTurnos=disciplinaTurnos;
        this.idDisciplina=gerarIdDisciplina();
        

     }

    public String  gerarIdDisciplina(){
        contadorDisciplina++;
        return "DISCIPLINAF:"+contadorDisciplina;



    }

    public String getNomeDisciplina() {
        return nomeDisciplina;
    }

    public void setNomeDisciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
    }

    public String getIdDisciplina() {
        return idDisciplina;
    }

    public void setIdDisciplina(String idDisciplina) {
        this.idDisciplina = idDisciplina;
    }
    public EnumTurno getDisciplinaTurnos() {
        return disciplinaTurnos;
    }

    public void setDisciplinaTurnos(EnumTurno disciplinaTurnos) {
        this.disciplinaTurnos = disciplinaTurnos;
    }


    


    //método de saída 
    public void  imprimeFichaDisciplina(){
    System.out.println("=========DISCIPLINA=========");
    System.out.println("NOME DA DISCIPLINA:"+getNomeDisciplina());
    System.out.println("ID DA DISCIPLINA:"+getIdDisciplina());
    System.out.println("TURNO : "+getDisciplinaTurnos());


    }
}

















