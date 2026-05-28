/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Utiliza o ArrayList para armazenar diferentes objetos que herdam da 
 * classe abstrata FiguraGeometrica. Ele percorre a lista usando um laço "for-each"
 * e chama os métodos de forma polimórfica para calcular a área de cada um.
 */
package figurageometrica;
import java.util.ArrayList;

abstract class FiguraGeometrica{
    private String nome;

    public FiguraGeometrica (String nome){
        this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    public abstract double calcularArea();
}

class Circulo extends FiguraGeometrica{
    private double raio;
    
    public Circulo(String nome, double raio){
        super (nome);
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI * raio * raio;
    }
}

class Quadrado extends FiguraGeometrica{
    private double lado;

    public Quadrado(String nome, double lado){
        super(nome);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado * lado;
    }
}

class Triangulo extends FiguraGeometrica{
    private double base;
    private double altura;

    public Triangulo (String nome, double base, double altura){
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea(){
        return (base * altura)/2;
    }
}

public class SistemaFiguras {
    public static void main(String[] args){
        ArrayList <FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Circulo("circulo", 2.5));
        figuras.add(new Quadrado("quadrado", 5));
        figuras.add(new Triangulo("triangulo", 3, 2));

        for(FiguraGeometrica figura : figuras){
            System.out.println("nome: " + figura.getNome());
            System.out.println("area: " + figura.calcularArea());
        }
    }
}