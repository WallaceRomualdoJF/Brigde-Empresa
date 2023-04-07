package org.example.wallace.bridge;

public class EmpresaRH extends Empresa {
    public EmpresaRH(Departamento departamento) {
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
