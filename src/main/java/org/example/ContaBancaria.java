package org.example;

public class ContaBancaria {

    private double saldo;
    private String numeroConta;

    public ContaBancaria(String numeroConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito de: " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Válor inválido para depósito.");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && saldo >= valor){
            saldo -= valor;
            System.out.println("Saque de: " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido para saque.");
        }
    }

    public void exibirSaldo(){
        System.out.println("Saldo atual: " + saldo);
    }

    public static void main(String[] args) {
        ContaBancaria contaBancaria = new ContaBancaria("200000");

        contaBancaria.depositar(500);
        contaBancaria.exibirSaldo();

        contaBancaria.sacar(150);
        contaBancaria.exibirSaldo();

        contaBancaria.sacar(175);
        contaBancaria.exibirSaldo();
    }

}