/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Demonstra a manipulação de Arrays em Java. A classe "Aluno" recebe um 
 * array numérico contendo as notas. O método "calcularMedia()" usa um 
 * laço de repetição (for-each) para somar as notas e divide pela quantidade 
 * total (tamanho do array) para gerar a média do estudante.
 */

class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    Aluno(String nome, String matricula, double[] notas){
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }
    
    double calcularMedia(){
        double soma = 0;
        for (double nota : notas){
            soma += nota;
        }
        return soma / notas.length;
    }
    
    void exibirInformacoes(){
        System.out.println("Nome: " + nome);
        System.out.println("Matricula: " + matricula);
        System.out.println("Media: " + calcularMedia());
    }    
}

public class SistemaAluno {
    public static void main(String[] args){
        double[] notas = {8.5, 7.0, 9.2};
        Aluno aluno = new Aluno ("Mariana", "20231012", notas);
        aluno.exibirInformacoes();
    }
}