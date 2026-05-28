/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Expande o conceito do código anterior adicionando novas formas geométricas
 * (Losango e Elipse) à estrutura existente, provando como a Orientação a Objetos
 * facilita a adição de novas funcionalidades sem quebrar o que já existe.
 */
package figurageometrica;
import java.util.ArrayList;

abstract class FiguraGeometrica {
    private String nome;
    
    public FiguraGeometrica(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }
    
    public abstract double calcularArea();
}

class Circulo extends FiguraGeometrica {
    private double raio;
    
    public Circulo(String nome, double raio) {
        super(nome);
        this.raio = raio;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Quadrado extends FiguraGeometrica {
    private double lado;
    
    public Quadrado(String nome, double lado) {
        super(nome);
        this.lado = lado;
    }
    
    @Override
    public double calcularArea() {
        return lado * lado;
    }
}

class Triangulo extends FiguraGeometrica {
    private double base;
    private double altura;
    
    public Triangulo(String nome, double base, double altura) {
        super(nome);
        this.base = base;
        this.altura = altura;
    }
    
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

class Losango extends FiguraGeometrica {
    private double diagonalMaior;
    private double diagonalMenor;
    
    public Losango(String nome, double diagonalMaior, double diagonalMenor) {
        super(nome);
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }
    
    @Override
    public double calcularArea() {
        return (diagonalMaior * diagonalMenor) / 2;
    }
}

class Elipse extends FiguraGeometrica {
    private double semiEixoA;
    private double semiEixoB;
    
    public Elipse(String nome, double semiEixoA, double semiEixoB) {
        super(nome);
        this.semiEixoA = semiEixoA;
        this.semiEixoB = semiEixoB;
    }
    
    @Override
    public double calcularArea() {
        return Math.PI * semiEixoA * semiEixoB;
    }
}

public class SistemaFigurasAvancado {
    public static void main(String[] args) {
        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();
        
        figuras.add(new Circulo("circulo", 2.5));
        figuras.add(new Quadrado("quadrado", 5));
        figuras.add(new Triangulo("triangulo", 3, 2));
        figuras.add(new Losango("losango", 8, 5));
        figuras.add(new Elipse("elipse", 4, 3));
        
        for (FiguraGeometrica figura : figuras) {
            System.out.println("nome: " + figura.getNome());
            System.out.println("area: " + figura.calcularArea());
        }
    }
}