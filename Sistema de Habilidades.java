/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Aplica Herança e Polimorfismo em um cenário de jogo/valorant :). 
 */

abstract class Agente {
    protected String nome;
    protected int vida;

    public Agente(String nome) {
        this.nome = nome;
        this.vida = 100;
    }

    public abstract void usarUltimate();

    public void exibirStatus() {
        System.out.println("Agente: " + nome + " | Vida: " + vida + " HP");
    }
}

class Duelista extends Agente {
    public Duelista(String nome) {
        super(nome);
    }

    @Override
    public void usarUltimate() {
        System.out.println(nome + " usou a Ultimate: Avanço rápido e recarga de armas ativada! Pronto para o entry fragger.");
    }
}

class Controlador extends Agente {
    public Controlador(String nome) {
        super(nome);
    }

    @Override
    public void usarUltimate() {
        System.out.println(nome + " usou a Ultimate: Fumaça densa bloqueando a visão de todo o bomb site!");
    }
}

public class SistemaMatch {
    public static void main(String[] args) {
        Agente[] time = new Agente[2];
        time[0] = new Duelista("Jett");
        time[1] = new Controlador("Omen");

        System.out.println("=== Início do Round ===");
        for (Agente agente : time) {
            agente.exibirStatus();
            agente.usarUltimate();
            System.out.println("--------------------");
        }
    }
}