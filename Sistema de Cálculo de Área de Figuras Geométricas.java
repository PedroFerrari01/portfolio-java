/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Demonstra o conceito de Polimorfismo e Classes Abstratas em Java. 
 * Ele cria uma superclasse abstrata "Figura" com o método "calcularArea()",
 * e três subclasses (Retangulo, Circulo, Triangulo) que implementam esse cálculo.
 * A classe Principal cria um array com diferentes figuras e imprime a área de cada uma.
 */

abstract class Figura {
    public abstract double calcularArea();
}

class Retangulo extends Figura {
    double base;
    double altura;

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

class Circulo extends Figura {
    double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

class Triangulo extends Figura {
    double base;
    double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
}

public class Principal {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[3];

        figuras[0] = new Retangulo(5, 4);
        figuras[1] = new Circulo(5);
        figuras[2] = new Triangulo(6, 5);

        for (int i = 0; i < figuras.length; i++) {
            System.out.println("Figura: " + figuras[i].getClass().getSimpleName());
            System.out.println("Area: " + figuras[i].calcularArea());
        }
    }
}