package org.example.wallace.bridge;

public interface Departamento {
    public void contratarFuncionario(String nome, double salario);
    public void demitirFuncionario(String nome);

    void contratarFuncionarioADM(String nome, double salario);

    void demitirFuncionarioADM(String nome);

    void contratarFuncionarioTI(String nome, double salario);

    void demitirFuncionarioTI(String nome);

    void contratarFuncionarioRH(String nome, double salario);

    void demitirFuncionarioRH(String nome);

    void contratarFuncionarioMKT(String nome, double salario);

    void demitirFuncionarioMKT(String nome);
}

