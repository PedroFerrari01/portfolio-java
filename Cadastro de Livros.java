/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Cria um modelo de dados para um "Livro" com atributos privados e 
 * métodos de acesso (getters/setters). Diferente do exemplo anterior, 
 * este programa roda o método main dentro da própria classe do objeto, 
 * instanciando um livro ("Dom Casmurro") e imprimindo suas informações.
 */

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;

    public Livro(String titulo, String autor, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getAutor(){
        return autor;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public static void main(String[] args){
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de publicação: " + livro.getAnoPublicacao());
    }
}