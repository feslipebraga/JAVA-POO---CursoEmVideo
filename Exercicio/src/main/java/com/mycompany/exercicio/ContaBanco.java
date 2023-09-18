package com.mycompany.exercicio;

public class ContaBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    public ContaBanco() {
        this.setStatus(false);
        this.setSaldo(0);
    }

    public void abrirConta(String tipo){
        this.setStatus(true);
        if ("CC".equals(tipo)) {
            this.setSaldo(50);
        } else if ("CP".equals(tipo)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso.");
    }
    
    public void fecharConta(){
        if (this.getSaldo() > 0){
            System.out.println("Erro ao fechar a conta, saldo MAIOR que 0");
        } else if (this.getSaldo() < 0) {
            System.out.println("Erro ao fechar a conta, saldo MENOR que 0");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso.");
        }
    }
    
    public void depositar(float valor){
        if (this.getStatus() == true) {
            this.setSaldo(this.getSaldo() + valor);
            System.out.println("Depósito realizado com sucesso na conta de " + this.getDono());
        } else {
            System.out.println("Impossível depositar, conta está fechada.");
        }
    }
    
    public void sacar(float valor){
        float saque = this.getSaldo() - valor;
        if (this.getStatus() == true){
            if (this.getSaldo() >= 0){
                this.setSaldo(saque);
                System.out.println("Saque de R$" + valor + " realizado com sucesso.");
                System.out.println("Saldo atual: R$" + this.getSaldo());
            } else {
                System.out.println("Saldo insuficiente para saque.");
                System.out.println("Saldo: R$" + this.getSaldo());
            }
        } else{
            System.out.println("Conta inativa, impossível sacar.");
        }
    }
    
    public void pagarMensal(){
        int valor = 0;
        if ("CC".equals(this.getTipo())){
            valor = 12;
        } else if ("CP".equals(this.getTipo())){
            valor = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - valor);
        } else {
            System.out.println("Conta inativa!");
        }
    }

    
    
    
    
    
    
    
    
    
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    

    @Override
    public String toString() {
        return "{numConta=" + numConta + ", tipo=" + tipo + ", dono=" + dono + ", saldo=" + saldo + ", status=" + status + '}';
    }
}

