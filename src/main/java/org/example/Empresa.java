package org.example;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private String cnpj;
    private List<String> funcionarios;

    public Empresa(String nome, String cnpj) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(String nomeFuncionario) {
        funcionarios.add(nomeFuncionario);
        System.out.println("Funcionário " + nomeFuncionario + " contratado.");
    }

    public void demitirFuncionario(String nomeFuncionario) {
        if (funcionarios.contains(nomeFuncionario)) {
            funcionarios.remove(nomeFuncionario);
            System.out.println("Funcionário " + nomeFuncionario + " demitido.");
        } else {
            System.out.println("Funcionário " + nomeFuncionario + " não encontrado na empresa.");
        }
    }

    public void exibirInformacoesFuncionarios() {
        System.out.println("Funcionários da Empresa " + nome + ":");
        if (!funcionarios.isEmpty()) {
            for (String funcionario : funcionarios) {
                System.out.println("- " + funcionario);
            }
        } else {
            System.out.println("Não há funcionários na empresa.");
        }
    }

    public static void main(String[] args) {
        Empresa minhaEmpresa = new Empresa("MinhaEmpresa", "123456789"); // Exemplo de uma empresa

        minhaEmpresa.contratarFuncionario("João");
        minhaEmpresa.contratarFuncionario("Maria");

        minhaEmpresa.exibirInformacoesFuncionarios();

        minhaEmpresa.demitirFuncionario("João");

        minhaEmpresa.exibirInformacoesFuncionarios();
    }
}