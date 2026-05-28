/**
 * @author pedro ferrari
 * O que o programa faz:
 * Mais um exemplo de Herança, desta vez com regras de negócio. 
 * A classe base "ContaCorrente" cobra uma taxa de 0.5% (0.005) em cada saque. 
 * A "ContaEspecial", que herda de ContaCorrente, sobrescreve o método "sacar()" 
 * para aplicar uma taxa bem menor, de apenas 0.1% (0.001). A classe "Banco" 
 * realiza as operações para validar os descontos diferentes em cada conta.
 */

class ContaCorrente {
    protected double saldo;

    public ContaCorrente(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double quantia) {
        if (quantia > 0) {
            saldo += quantia;
        }
    }

    public boolean sacar(double quantia) {
        double taxa = quantia * 0.005; 
        double total = quantia + taxa;

        if (total <= saldo) {
            saldo -= total;
            return true;
        } else {
            return false;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{saldo=" + saldo + "}";
    }
}

class ContaEspecial extends ContaCorrente {

    public ContaEspecial(double saldoInicial) {
        super(saldoInicial);
    }

    @Override
    public boolean sacar(double quantia) {
        double taxa = quantia * 0.001; 
        double total = quantia + taxa;

        if (total <= saldo) {
            saldo -= total;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "ContaEspecial{saldo=" + saldo + "}";
    }
}

public class Banco {
    public static void main(String[] args) {
        
        ContaCorrente conta1 = new ContaCorrente(1000.0);
        conta1.depositar(500.0);
        conta1.sacar(200.0); // Desconta a taxa de 0.5%

        System.out.println("Conta Corrente Comum:");
        System.out.println(conta1);

        ContaEspecial conta2 = new ContaEspecial(10000.0);
        conta2.depositar(5000.0);
        conta2.sacar(2000.0); // Desconta a taxa de 0.1%

        System.out.println("Conta Corrente Especial:");
        System.out.println(conta2);
    }
}