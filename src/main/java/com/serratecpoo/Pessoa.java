package com.serratecpoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Pessoa {
    public String nomePessoa;
    protected String cpf;
    protected String dataNascimento;
    protected String email;
    protected String telefone;
    protected static List<Pessoa> listaPessoas = new ArrayList<>();

    private static Scanner sc = new Scanner(System.in); 

    // Construtor padrão
    public Pessoa() { }

    // Construtor com parâmetros
    public Pessoa(String nomePessoa, String cpf, String dataNascimento, String email, String telefone) {
        this.nomePessoa = nomePessoa;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.telefone = telefone;
        adicionarPessoa(this);
    }

    // Getters e Setters
    public String getNomePessoa() {
        this.nomePessoa=nomePessoa;
        return nomePessoa;
    }

    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    // Método para adicionar uma pessoa à lista estática
    public static void adicionarPessoa(Pessoa pessoa) {
        listaPessoas.add(pessoa);
    }

    // Método para listar todas as pessoas
    public static List<Pessoa> listarPessoas() {
        return listaPessoas;}

    // Método para cadastrar uma pessoa
    public static Pessoa cadastrarPessoa() {
        System.out.println("NOME COMPLETO");
        String nomePessoa = sc.nextLine();

        System.out.println("DIGITE O CPF:");
        String cpf = sc.nextLine();

        System.out.println("DATA NASCIMENTO (dd/mm/yyyy):");
        String dataNascimento = sc.nextLine();

        System.out.println("Digite o email:");
        String email = sc.nextLine();

        System.out.println("Digite o telefone:");
        String telefone = sc.nextLine();

        // Cria uma nova pessoa e adc na lista
        Pessoa novaPessoa = new Pessoa(nomePessoa, cpf, dataNascimento, email, telefone);
        System.out.println("INSERINDO DADOS!");
        return novaPessoa;
    }


}


