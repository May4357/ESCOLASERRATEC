package com.serratecpoo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SerratecpooApplication {

    public static void main(String[] args) {
        SpringApplication.run(SerratecpooApplication.class, args);
        int opcao, opcaoAluno, opcaoProfessor;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("====================| BEM VINDO(A) AO SERRATEC  |========================");
            System.out.println("[1] MENU ESTUDANTE         [2] MENU PROFESSOR       [0] SAIR");
            opcao = sc.nextInt();
            sc.nextLine(); // Limpa o buffer

            switch (opcao) {
                case 1: // **************************************MENU ESTUDANTE***************************
                    do {
                        System.out.println("====================| MENU DO ESTUDANTE |========================");
                        System.out.println("[1] ADICIONAR ESTUDANTE        [2] LISTAR ESTUDANTES\n[3] REMOVER ESTUDANTE\n[0] VOLTAR AO MENU PRINCIPAL");
                        opcaoAluno = sc.nextInt();
                        

                        switch (opcaoAluno) {
                            case 1: // ADC ESTUDANTE
                                Pessoa pessoa = Pessoa.cadastrarPessoa();  // Cadastrar pessoa
                                Estudante estudante = new Estudante(pessoa.getNomePessoa(), pessoa.getCpf(), pessoa.getDataNascimento(), pessoa.getEmail(), pessoa.getTelefone());
                                Pessoa.adicionarPessoa(estudante);
                                System.out.println("Estudante cadastrado com sucesso. ID: " + estudante.getIdEstudante());
                                break;

                            case 2: // LISTAR ESTUDANTE
                                List<Pessoa> listaEstudantes = Pessoa.listarPessoas();
                                if (listaEstudantes.isEmpty()) {
                                    System.out.println("A lista de estudantes está vazia.");
                                } else {
                                    for (Pessoa p : listaEstudantes) {
                                        if (p instanceof Estudante est) {  // Verifica se a pessoa é um Estudante
                                            est.imprimeFichaAluno();
                                        }
                                    }
                                }
                                break;

                            case 3: // REMOVER ESTUDANTE
                                List<Pessoa> listaEstudantesRemover = Pessoa.listarPessoas();
                                System.out.println("Qual é o nome do Estudante que gostaria de remover?");
                                String nomeAlunoRemovido = sc.nextLine();  // Recebe o nome do estudante

                                if (listaEstudantesRemover.isEmpty()) {
                                    System.out.println("Não há estudantes a serem removidos.");
                                } else {
                                    boolean estudanteRemovido = false;  // Variável para indicar se um estudante foi removido
                                    List<Pessoa> listaParaRemover = new ArrayList<>(listaEstudantesRemover); // Cria uma cópia da lista

                                    for (Pessoa p : listaParaRemover) { // Percorre a lista para encontrar o estudante pelo nome
                                        if (p instanceof Estudante est) {  // Verifica se a pessoa é um Estudante
                                            // Comparação do nome
                                            if (est.getNomePessoa().equalsIgnoreCase(nomeAlunoRemovido)) {
                                                listaEstudantesRemover.remove(p);  // Remove o estudante encontrado da lista original
                                                estudanteRemovido = true;
                                                System.out.println("Estudante com nome " + nomeAlunoRemovido + " foi removido.");
                                                break; // sai do loop após remover
                                            }
                                        }
                                    }

                                    if (!estudanteRemovido) {
                                        System.out.println("Nenhum estudante com o nome fornecido foi encontrado.");
                                    }
                                }
                                break;

                            case 0: //MENU PRINCIPAL
                                System.out.println("Certo, vou retornar ao menu principal.");
                                break;

                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (opcaoAluno != 0);
                    break;

                case 2: //****************************MENU DO PROFESSOR********************************************************** 
                    do {
                        System.out.println("====================| MENU DO PROFESSOR |========================");
                        System.out.println("[1] ADICIONAR PROFESSOR        [2] LISTAR PROFESSOR\n[3] REMOVER PROFESSOR\n[0] VOLTAR AO MENU PRINCIPAL");
                        opcaoProfessor = sc.nextInt();
                    

                        switch (opcaoProfessor) {
                            case 1: //ADC PROFESSOR
                                Pessoa pessoa = Pessoa.cadastrarPessoa();  // Cadastrar como pessoa
                                Professor professor = new Professor(pessoa.getNomePessoa(), pessoa.getCpf(), pessoa.getDataNascimento(), pessoa.getEmail(), pessoa.getTelefone());
                                Pessoa.adicionarPessoa(professor);
                                System.out.println("Professor cadastrado com sucesso. ID: " + professor.getIdProfessor());
                                break;

                            case 2: // LISTAR PROFESSOR
                                List<Pessoa> listaProfessores = Pessoa.listarPessoas();
                                if (listaProfessores.isEmpty()) {
                                    System.out.println("A lista de professores está vazia.");
                                } else {
                                    for (Pessoa p : listaProfessores) {
                                        if (p instanceof Professor prof) {  // Verifica se a pessoa é um Professor
                                            prof.imprimeFichaProfessor();
                                        }
                                    }
                                }
                                break;

                            case 3: // REMOVER PROFESSOR
                                List<Pessoa> listaProfessorRemover = Pessoa.listarPessoas();
                                System.out.println("Qual é o nome do Professor que gostaria de remover?");
                                String nomeProfessorRemovido = sc.nextLine();  // Recebe o nome do professor

                                if (listaProfessorRemover.isEmpty()) {
                                    System.out.println("Não há professores a serem removidos.");
                                } else {
                                    boolean professorRemovido = false;  // Variável para indicar se um professor foi removido
                                    List<Pessoa> listaParaRemover = new ArrayList<>(listaProfessorRemover); // Cria uma cópia da lista

                                    for (Pessoa p : listaParaRemover) { // Percorre a lista para encontrar o professor pelo nome
                                        if (p instanceof Professor prof) {  // Verifica se a pessoa é um Professor
                                            // Comparação do nome
                                            if (prof.getNomePessoa().equalsIgnoreCase(nomeProfessorRemovido)) {
                                                listaProfessorRemover.remove(p);  // Remove o professor encontrado da lista original
                                                professorRemovido = true;
                                                System.out.println("Professor " + nomeProfessorRemovido + " foi removido.");
                                                break; // sai do loop após remover
                                            }
                                        }
                                    }

                                    if (!professorRemovido) {
                                        System.out.println("Nenhum professor com o nome fornecido foi encontrado.");
                                    }
                                }
                                break;

                            case 0: //RETORNAR AO MENU PRINCIPAL
                                System.out.println("Certo, vou retornar ao menu principal.");
                                break;

                            default:
                                System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                        }
                    } while (opcaoProfessor != 0);
                    break;

                case 0: // Sair do aplicativo
                    System.out.println("Saindo do aplicativo. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        } while (opcao != 0);

        sc.close(); // Fecha o scanner ao final
    }
}







                

