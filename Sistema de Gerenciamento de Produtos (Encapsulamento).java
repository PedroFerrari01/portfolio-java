/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Demonstra o conceito de Encapsulamento em Java. 
 * A classe "Produto" possui atributos privados (nome, preco, quantidade) 
 * que são acessados e modificados com segurança através de métodos getters e setters.
 * A classe principal testa a criação de um produto e a atualização de seus dados.
 */

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade){
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
    
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getPreco(){
        return preco;
    }
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getQuantidade(){
        return quantidade;
    }
    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;
    }
}

public class GerenciadorProduto {
    public static void main(String[] args){
        Produto produto = new Produto("Caneta", 1.50, 100);
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preco: R$" + produto.getPreco());
        System.out.println("Quantidade em estoque: " + produto.getQuantidade());
        
        // Atualizando os valores usando os setters
        produto.setPreco(1.75);
        produto.setQuantidade(120);
        
        System.out.println("Novo preco: R$" + produto.getPreco());
        System.out.println("Nova quantidade em estoque: " + produto.getQuantidade());
    }
}