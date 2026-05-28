/**
 * @author pedro ferrari
 * O que o programa faz:
 * Simula o caixa de uma lanchonete utilizando um laço "do-while" e um "switch-case".
 * O programa exibe o menu e permite que o usuário adicione múltiplos itens ao pedido.
 * Ele acumula o valor total gasto na variável "total" e concatena os nomes dos 
 * itens escolhidos na String "pedido". O laço se repete até o usuário digitar 0.
 */

import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opcao;
        double total = 0;

        // String para guardar os itens escolhidos
        String pedido = "";

        do {
            System.out.println("   MENU HAMBURGUERIA ");
            System.out.println("1 - Hamburguer (R$ 10.00)");
            System.out.println("2 - X-Burguer (R$ 12.00)");
            System.out.println("3 - Refrigerante (R$ 5.00)");
            System.out.println("4 - Cerveja (R$ 7.00)");
            System.out.println("5 - Batata Frita (R$ 8.00)");
            System.out.println("0 - Finalizar pedido");
            System.out.print("Escolha uma opção: ");

            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    total += 10.0;
                    pedido += "Hamburguer - R$10.00\n";
                    System.out.println("Hamburguer adicionado!");
                    break;

                case 2:
                    total += 12.0;
                    pedido += "X-Burguer - R$12.00\n";
                    System.out.println("X-Burguer adicionado!");
                    break;

                case 3:
                    total += 5.0;
                    pedido += "Refrigerante - R$5.00\n";
                    System.out.println("Refrigerante adicionado!");
                    break;

                case 4:
                    total += 7.0;
                    pedido += "Cerveja - R$7.00\n";
                    System.out.println("Cerveja adicionada!");
                    break;

                case 5:
                    total += 8.0;
                    pedido += "Batata Frita - R$8.00\n";
                    System.out.println("Batata frita adicionada!");
                    break;

                case 0:
                    System.out.println("  PEDIDO FINAL ");
                    System.out.println(pedido);
                    System.out.println("Total: R$ " + total);
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        } while (opcao != 0);

        sc.close();
    }
}