/**
 * @author Pedro ferrari
 * O que o programa faz:
 * Utiliza Herança e Polimorfismo para gerenciar diferentes tipos de veículos.
 * A superclasse "Veiculo" define atributos comuns (marca, modelo, ano), 
 * enquanto "Carro" e "Moto" herdam esses atributos e adicionam características
 * específicas (portas, tipo de partida). A classe Oficina cria e exibe os detalhes.
 */

abstract class Veiculo {
    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public abstract void exibirDetalhes();
}

class Carro extends Veiculo {
    int quantidadePortas;

    public Carro(String marca, String modelo, int ano, int quantidadePortas) {
        super(marca, modelo, ano);
        this.quantidadePortas = quantidadePortas;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Carro ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Quantidade de Portas: " + quantidadePortas);
    }
}

class Moto extends Veiculo {
    String tipoPartida;

    public Moto(String marca, String modelo, int ano, String tipoPartida) {
        super(marca, modelo, ano);
        this.tipoPartida = tipoPartida;
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("=== Moto ===");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Tipo de Partida: " + tipoPartida);
    }
}

public class Oficina {
    public static void main(String[] args) {
        Veiculo[] veiculos = new Veiculo[3];

        veiculos[0] = new Veiculo("Toyota", "Corolla", 2020) {
            @Override
            public void exibirDetalhes() {
                // Necessário implementar o método abstrato na classe anônima
            }
        }; 
        veiculos[1] = new Carro("Chevrolet", "Onix", 2022, 4);
        veiculos[2] = new Moto("Honda", "CG 160", 2023, "Elétrica");

        // Exibindo os detalhes da classe base manualmente
        System.out.println("=== Veiculo ===");
        System.out.println("Marca: " + veiculos[0].marca);
        System.out.println("Modelo: " + veiculos[0].modelo);
        System.out.println("Ano: " + veiculos[0].ano);

        System.out.println();

        // Subclasses usando polimorfismo
        for (int i = 1; i < veiculos.length; i++) {
            veiculos[i].exibirDetalhes();
            System.out.println();
        }
    }
}