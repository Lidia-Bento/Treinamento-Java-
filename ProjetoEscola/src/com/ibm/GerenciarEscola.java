package com.ibm;

import java.util.Scanner;

public class GerenciarEscola {
    Aluno aluno = new Aluno();
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here
        GerenciarEscola ge = new GerenciarEscola();
        int opc = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("----- Plataforma Escolar -----");
            System.out.println("1..Cadastrar Aluno");
            System.out.println("2..Consultar Aluno");
            System.out.println("3..Adicionar matérias");
            System.out.println("4..Sair");
            System.out.println("------------------------------");
            System.out.println("Digite a opção desejada:");
            opc = Integer.parseInt(sc.nextLine());

            switch (opc) {
                case 1:
                    ge.execCadastrar();
                    break;
                case 2:
                    ge.execConsultar();
                    break;
                case 3:
                    ge.execAddMateria();
                    break;
                case 4:
                    System.out.println("\nFim\n");
                    break;
                default:
                    System.out.println("\nOpçao Inválida!\n");
                    break;
            }
        }while(opc!=4);
    }//main

    private void execConsultar() {
        System.out.println("***********************************************");
        System.out.println("Nome da Instituição de Ensino: " + aluno.getNomeEscola());
        System.out.println("Nome do Aluno: " + aluno.getNomeAluno());
        System.out.println("Número da Matrícula: " + aluno.getNumeroMatricula());
        System.out.println("Nome das Matérias: " + aluno.getAddMateria());
        System.out.println("Nome do Professor: " + aluno.getNomeProfessor());
        System.out.println("***********************************************");
       // System.out.println(aluno.toString());
    }

    private void execAddMateria() {
        System.out.println("Digite o nome da matéria a ser adicionada:");
        aluno.setAddMateria(sc.nextLine());

        System.out.println("Digite o nome do Professor(a):");
        aluno.setNomeProfessor(sc.nextLine());

        System.out.println("Matéria adicionada com sucesso!");
        System.out.println("\n");
    }

    public void execCadastrar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome:");
        aluno.setNomeAluno(sc.nextLine());

        System.out.println("Digite o nome da Instituição de Ensino:");
        aluno.setNomeEscola(sc.nextLine());

        System.out.println("Digite o número da sua matrícula:");
        aluno.setNumeroMatricula(sc.nextLine());
        System.out.println("Aluno cadastrado com sucesso!");
        System.out.println("\n");
    }
}

