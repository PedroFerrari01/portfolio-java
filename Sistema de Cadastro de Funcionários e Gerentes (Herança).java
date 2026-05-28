/**
 * @author pedro ferrari
 * O que o programa faz:
 * Demonstra a aplicação de Herança em Java. A superclasse "Funcionario" guarda 
 * os atributos básicos (nome e salário). A subclasse "Gerente" herda esses 
 * atributos e adiciona o "bonus", reescrevendo (Overriding) o método "getSalario()" 
 * para somar o bônus ao salário base. A classe "Empresa" utiliza a classe Scanner 
 * para receber esses dados do usuário pelo console.
 */

import java.util.Scanner;
        
class Funcionario {   
    protected String nome;
    protected double salario;

    public Funcionario (String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;   
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
    
    @Override
    public String toString(){
        return "Funcionario(nome=" + nome +" ,salario = "+salario +")";
    }
}

class Gerente extends Funcionario {
    private double bonus;
    
    public Gerente(String nome, double salario, double bonus){
        super(nome,salario);
        this.bonus = bonus;
    }
    
    @Override
    public double getSalario(){
        return salario + bonus;
    }
    
    @Override
    public String toString(){
        return "Gerente(nome=" + nome +", salario Base=" +salario +", bonus="+ bonus+", salario Total="+getSalario()+")";
    }
}

public class Empresa {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Cadastro de Funcionario ===");
        System.out.print("Nome do funcionario: ");
        String nomeFuncionario = scanner.nextLine();
        System.out.print("Salario do Funcionario: ");
        double salarioFuncionario = scanner.nextDouble();
        scanner.nextLine(); // Limpando o buffer do teclado
        
        System.out.println("=== Cadastro de Gerente ===");
        System.out.print("Nome do gerente: ");
        String nomeGerente = scanner.nextLine();
        System.out.print("Salario base do gerente: ");
        double salarioGerente = scanner.nextDouble();
        System.out.print("Bonus do gerente: ");
        double bonusGerente = scanner.nextDouble();
        
        Funcionario f1 = new Funcionario(nomeFuncionario, salarioFuncionario);
        Gerente g1 = new Gerente(nomeGerente, salarioGerente, bonusGerente);
        
        System.out.println("\n--- Dados cadastrados ---");
        System.out.println(f1);
        System.out.println(g1);
        
        scanner.close();
    }
}