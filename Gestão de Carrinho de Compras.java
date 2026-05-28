/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Demonstra a relação de Composição (um-para-muitos). 
 * A classe "Pedido" gerencia uma lista (ArrayList) de objetos "Produto".
 * Ele soma os valores iterando pela lista e aplica uma lógica de 
 * cupom de desconto caso seja um dia especial, como um aniversário.
 */

import java.util.ArrayList;

class Produto {
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) {
        this.descricao = descricao;
        this.preco = preco;
    }

    public double getPreco() { return preco; }
    
    @Override
    public String toString() {
        return "- " + descricao + " (R$ " + preco + ")";
    }
}

class Pedido {
    private ArrayList<Produto> itens = new ArrayList<>();
    private boolean aniversarioCliente;

    public Pedido(boolean aniversarioCliente) {
        this.aniversarioCliente = aniversarioCliente;
    }

    public void adicionarProduto(Produto p) {
        itens.add(p);
    }

    public void fecharPedido() {
        double total = 0;
        System.out.println("=== Resumo do Pedido ===");
        
        for (Produto item : itens) {
            System.out.println(item);
            total += item.getPreco();
        }

        System.out.println("Subtotal: R$ " + total);

        if (aniversarioCliente) {
            System.out.println("🎉 Desconto de Aniversário (28/05) aplicado! (-15%)");
            total = total - (total * 0.15);
        }

        System.out.println("Total a Pagar: R$ " + total);
    }
}

public class CarrinhoDeCompras {
    public static void main(String[] args) {
      
        Pedido meuPedido = new Pedido(true);

        meuPedido.adicionarProduto(new Produto("Microfone Fifine", 230.00));
        meuPedido.adicionarProduto(new Produto("Smartphone Galaxy S25", 3800.00));
        meuPedido.adicionarProduto(new Produto("Álbum da Copa de Capa Dura", 70.00));

        meuPedido.fecharPedido();
    }
}