package br.com.digitalhouse;

public class Empresa extends Departamento {
    public float cnpj;
    public String nome;
    public Departamento departamento;

    public Empresa(String nome, float salario, double dataDeAdmin, float cnpj, String nome1, String departamento) {
        super(nome, salario, dataDeAdmin);
        this.cnpj = cnpj;
        this.nome = nome1;
        this.departamento = departamento;
    }

    public float getCnpj() {
        return cnpj;
    }

    public void setCnpj(float cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public void setDepartamento(Departamento departamento) {
        this.departamento = departamento;
    }



}
