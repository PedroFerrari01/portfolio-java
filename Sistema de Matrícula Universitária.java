/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Mais um exemplo de relacionamento entre objetos. A classe "Curso" pode 
 * matricular vários "Alunos". O método "listarMatriculados()" percorre
 * a lista e exibe quem está vinculado àquela disciplina.
 */

import java.util.ArrayList;

class Estudante {
    private String nome;
    private String ra; 

    public Estudante(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }
    public String getNome() { return nome; }
}

class Curso {
    private String nomeCurso;
    private ArrayList<Estudante> matriculados;

    public Curso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
        this.matriculados = new ArrayList<>(); 
    }

    public void matricular(Estudante estudante) {
        matriculados.add(estudante);
        System.out.println(estudante.getNome() + " matriculado(a) com sucesso no curso de " + nomeCurso);
    }

    public void listarMatriculados() {
        System.out.println("\n=== Turma de " + nomeCurso + " ===");
        System.out.println("Total de alunos: " + matriculados.size());
        for (Estudante e : matriculados) {
            System.out.println("- " + e.getNome());
        }
    }
}

public class GestaoAcademica {
    public static void main(String[] args) {
        Curso ads = new Curso("Análise e Desenvolvimento de Sistemas");

        Estudante est1 = new Estudante("Pedro Ferrari", "2026001");
        Estudante est2 = new Estudante("Neymar Junior", "2026002");

        ads.matricular(est1);
        ads.matricular(est2);

        ads.listarMatriculados();
    }
}