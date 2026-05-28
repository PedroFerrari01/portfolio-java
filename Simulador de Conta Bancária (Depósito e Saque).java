/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Simula o funcionamento básico de uma Conta Corrente bancária. 
 * Possui métodos para "depositar" (que apenas soma ao saldo) e "sacar", 
 * que inclui uma estrutura de controle (if/else) para verificar se o 
 * valor do saque é menor ou igual ao saldo disponível antes de autorizar a operação.
 */

class ContaCorrente {
    private String titular;
    private double saldo;

    public ContaCorrente(String titular, double saldoinicial){
        this.titular = titular;
        this.saldo = saldoinicial;  
    }
    
    public void depositar(double valor){
        saldo += valor;
    }
    
    public void sacar(double valor){
        if(valor <= saldo){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    
    public void mostrarSaldo() {
        System.out.println("Titular: " + titular + ", Saldo: " + saldo);
    }
}

public class SistemaBancario {
    public static void main(String[] args) {
        
        // Criando uma conta bancária com um saldo inicial de 1000   
        ContaCorrente conta = new ContaCorrente("Joao Silva", 1000.0);
        
        // Exibindo o saldo inicial
        conta.mostrarSaldo();
        
        // Depositando 500 na conta
        conta.depositar(500.0);
        conta.mostrarSaldo();
        
        // Tentando sacar 300
        conta.sacar(300.0);
        conta.mostrarSaldo();
        
        // Tentando sacar um valor maior que o saldo disponível
        conta.sacar(1500.0);
        conta.mostrarSaldo();
    }
}