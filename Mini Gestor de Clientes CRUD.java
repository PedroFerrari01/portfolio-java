/**
 * @author Pedro Ferrari
 * O que o programa faz:
 * Simula as operações básicas de um CRM.
 * Permite cadastrar clientes em uma lista, listar todos eles e buscar um cliente específico pelo nome de forma simples.
 */

import java.util.ArrayList;

class Cliente {
    private String nome;
    private String email;
    private String telefone;

    public Cliente(String nome, String email, String telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() { return nome; }
    
    @Override
    public String toString() {
        return "Cliente: " + nome + " | Email: " + email + " | Tel: " + telefone;
    }
}

public class MiniCRM {
    public static void main(String[] args) {
        
        ArrayList<Cliente> bancoDeClientes = new ArrayList<>();

       
        bancoDeClientes.add(new Cliente("Ana Souza", "ana@email.com", "11999998888"));
        bancoDeClientes.add(new Cliente("Carlos Lima", "carlos@email.com", "11977776666"));

  
        System.out.println("=== Base de Clientes ===");
        for (Cliente cliente : bancoDeClientes) {
            System.out.println(cliente);
        }


        System.out.println("\n=== Buscando cliente 'Ana Souza' ===");
        String termoBusca = "Ana Souza";
        boolean encontrado = false;
        
        for (Cliente cliente : bancoDeClientes) {
            if (cliente.getNome().equalsIgnoreCase(termoBusca)) {
                System.out.println("Encontrado: " + cliente);
                encontrado = true;
                break; 
            }
        }
        
        if (!encontrado) {
            System.out.println("Cliente não encontrado no sistema.");
        }
    }
}