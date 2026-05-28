/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Introduz o uso de Interfaces em Java. A interface "MetodoPagamento" 
 * exige que qualquer classe que a assine (implements) tenha a função 
 * "processarPagamento()". 

interface MetodoPagamento {
    void processarPagamento(double valor);
}

class PagamentoPix implements MetodoPagamento {
    private String chavePix;

    public PagamentoPix(String chavePix) {
        this.chavePix = chavePix;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Processando PIX de R$ " + valor + " para a chave: " + chavePix);
        System.out.println("Pagamento aprovado instantaneamente!\n");
    }
}

class PagamentoCartao implements MetodoPagamento {
    private String numeroCartao;

    public PagamentoCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void processarPagamento(double valor) {
        System.out.println("Enviando requisição de R$ " + valor + " para a operadora do cartão (Final " + numeroCartao.substring(numeroCartao.length() - 4) + ")");
        System.out.println("Transação autorizada pelo banco.\n");
    }
}

public class ECommercePagamentos {
    public static void main(String[] args) {
        double valorCarrinho = 250.75;
        
        System.out.println("=== Checkout da Loja ===");
        
       
        MetodoPagamento pagamento1 = new PagamentoPix("000.111.222-33");
        pagamento1.processarPagamento(valorCarrinho);

        MetodoPagamento pagamento2 = new PagamentoCartao("4111222233334444");
        pagamento2.processarPagamento(valorCarrinho);
    }
}