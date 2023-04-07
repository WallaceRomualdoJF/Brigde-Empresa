package org.example.wallace.bridge;

public class EmpresaMKT extends Empresa {
    public EmpresaMKT(Departamento departamento) {
        super(departamento);
    }

    @Override
    public void contratarFuncionario(String nome, double salario) {
        departamento.contratarFuncionario(nome, salario);
    }

    @Override
    public void demitirFuncionario(String nome) {
        departamento.demitirFuncionario(nome);
    }
}
