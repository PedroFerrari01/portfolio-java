/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Introduz o uso de 'Enum' para controlar estados rígidos (ABERTO, EM_ANDAMENTO, RESOLVIDO).
 * Simula um sistema de chamados (estilo ReclameAqui/Trustpilot) onde o 
 * status do ticket avança conforme o problema é analisado.
 */

// O Enum garante que o status só pode ser um desses três, evitando erros de digitação.
enum StatusChamado {
    ABERTO,
    EM_ANDAMENTO,
    RESOLVIDO
}

class TicketSuporte {
    private int id;
    private String descricao;
    private StatusChamado status;

    public TicketSuporte(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
        this.status = StatusChamado.ABERTO; // Todo chamado "nasce" como "Aberto"
    }

    public void iniciarAtendimento() {
        this.status = StatusChamado.EM_ANDAMENTO;
        System.out.println("Ticket #" + id + ": Atendimento iniciado.");
    }

    public void resolverChamado() {
        this.status = StatusChamado.RESOLVIDO;
        System.out.println("Ticket #" + id + ": Problema resolvido!");
    }

    public void exibirDetalhes() {
        System.out.println("ID: " + id + " | Status: [" + status + "] | Problema: " + descricao);
    }
}

public class HelpDesk {
    public static void main(String[] args) {
        System.out.println("=== Central de Suporte ===");
        
        TicketSuporte ticket1 = new TicketSuporte(101, "Cobrança indevida no Pix.");
        TicketSuporte ticket2 = new TicketSuporte(102, "Erro ao logar na plataforma.");

        ticket1.exibirDetalhes();
        ticket2.exibirDetalhes();

        System.out.println("\n-- Atualizando status --");
        ticket1.iniciarAtendimento();
        ticket1.resolverChamado();
        
        ticket2.iniciarAtendimento();

        System.out.println("\n=== Status Final ===");
        ticket1.exibirDetalhes();
        ticket2.exibirDetalhes();
    }
}