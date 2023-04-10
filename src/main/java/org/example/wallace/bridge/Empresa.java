package org.example.wallace.bridge;

public abstract class Empresa {
    protected Departamento departamento;

    public Empresa(Departamento departamento) {
        this.departamento = departamento;
    }

    public abstract void contratarFuncionario(String nome, double salario);
    public abstract void demitirFuncionario(String nome);
}
