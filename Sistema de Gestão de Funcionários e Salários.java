/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Cria um modelo de "Funcionario" com atributos básicos (nome, cargo, salário).
 * O destaque é o método "aplicarAumento()", que recebe um valor percentual, 
 * calcula o acréscimo e atualiza o salário do funcionário. A classe principal
 * cria três funcionários diferentes e aplica aumentos variados para testar.
 */

class Funcionario {
    String nome;
    String cargo;
    double salario;
    
    Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }
    
    void aplicarAumento(double percentual){
        salario += salario * (percentual / 100);
    }
    
    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salario: " + salario);
    }     
}

public class GerenciadorFuncionario {
    public static void main(String [] args){
        Funcionario func = new Funcionario ("Carlos", "Engenheiro", 5000);
        Funcionario func2 = new Funcionario ("Jose", "Analista", 6000);
        Funcionario func3 = new Funcionario ("Osvaldo", "Professor", 1000);
        
        func.aplicarAumento(10);
        func.exibirInformacoes();
        
        func2.aplicarAumento(15);
        func2.exibirInformacoes();
        
        func3.aplicarAumento(100);
        func3.exibirInformacoes();
    }       
}