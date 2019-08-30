package com.ibm;

public class Aluno {
    private String nomeAluno;
    private String numeroMatricula;
    private String nomeEscola;
    private String addMateria;
    private String nomeProfessor;



    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getNumeroMatricula() {
        return numeroMatricula;
    }

    public void setNumeroMatricula(String numeroMatricula) {
        this.numeroMatricula = numeroMatricula;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    @Override
    public String toString() {
        return "Dados do Aluno: \"\n\" Nome da Instituição de Ensino: " + nomeEscola + " \"\n\" Nome do Aluno: " + nomeAluno + "\"\n\" Número da Matrícula: " + numeroMatricula + " \"\n\" Nome das Matérias: " + addMateria +  "\"\n\" Nome do Professor(a):" + nomeProfessor;
    }

    public String getNomeProfessor() {
        return nomeProfessor;
    }

    public void setNomeProfessor(String nomeProfessor) {
        this.nomeProfessor = nomeProfessor;
    }

    public String getAddMateria() {
        return addMateria;
    }

    public void setAddMateria(String addMateria) {
        this.addMateria = addMateria;
    }
}
