package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class MainEmpresa {
    public static void main(String[] args) {
        Empresa empresa = new Empresa("A2","12.193.392/0001-07");

        Funcionario funcionario1 = new Funcionario("Funcionario 1",2000.00,"01/01/2018");
        Funcionario funcionario2 = new Funcionario("Funcionario 2",2000.00,"01/02/2018");
        Funcionario funcionario3 = new Funcionario("Funcionario 3",3000.00,"01/03/2018");
        Funcionario funcionario4 = new Funcionario("Funcionario 4",4500.00,"01/04/2018");
        Funcionario funcionario5 = new Funcionario("Funcionario 5",3200.00,"01/05/2018");
        Funcionario funcionario6 = new Funcionario("Funcionario 6",1000.00,"01/06/2018");

        List<Departamento> departamentos = new ArrayList<>();

        Departamento TI = new Departamento("TI");
        Departamento Contabil = new Departamento("Contabil");
        Departamento RH = new Departamento("RH");

        departamentos.add(TI);
        departamentos.add(Contabil);
        departamentos.add(RH);

        empresa.setDepartamentos(departamentos);



        TI.aumentoSalario();
        TI.imprimirDepto();

        tranfereFuncionario(TI,RH,funcionario1);
        empresa.imprimirEmpresa();

        TI.addFuncionario(funcionario1);
        TI.addFuncionario(funcionario2);
        Contabil.addFuncionario(funcionario3);
        Contabil.addFuncionario(funcionario4);
        RH.addFuncionario(funcionario5);
        RH.addFuncionario(funcionario6);
        empresa.imprimirEmpresa();




    }

    public static void tranfereFuncionario(Departamento deptoOrigem, Departamento deptoDestino, Funcionario funcionario){
        System.out.println("Transferencia de funcionario");
        System.out.println("Tranferenrindo Funcionario: "+funcionario.getNome());
        System.out.println("Departamento Origem: "+deptoOrigem.getNomeDepto());
        deptoOrigem.getFuncionarios().remove(funcionario.hashCode());
        System.out.println("Departamento Destino: "+deptoDestino.getNomeDepto());
        deptoDestino.addFuncionario(funcionario);
    }
}
