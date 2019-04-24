package br.com.digitalhouse;

public class Funcionario {
    private String nome;
    private float salario;
    private double dataDeAdmin;

    public Funcionario(String nome, float salario, double dataDeAdmin) {
        this.nome = nome;
        this.salario = salario;
        this.dataDeAdmin = dataDeAdmin;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public double getDataDeAdmin() {
        return dataDeAdmin;
    }

    public void setDataDeAdmin(double dataDeAdmin) {
        this.dataDeAdmin = dataDeAdmin;
    }
}
