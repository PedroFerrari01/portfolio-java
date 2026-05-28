/**
 * @author pedro 
 * O que o programa faz:
 * Apresenta um menu interativo no console usando a estrutura "switch-case".
 * O usuário escolhe uma opção numérica e o programa executa a operação correspondente:
 * verificar se um número é par/ímpar, calcular fatorial com laço "while", 
 * calcular área de retângulo/triângulo ou calcular a média de 3 notas.
 */

import java.util.Scanner;

public class ExercicioJubran {
    public static void main (String [] args){
        Scanner sc= new Scanner(System.in);
     
        System.out.println("Escolha uma opção:");
        System.out.println("1 - Par ou Impar");
        System.out.println("2 - Fatorial");
        System.out.println("3 - Area do Retangulo");
        System.out.println("4 - Area do Triangulo");
        System.out.println("0 - Sair");
        System.out.print ("Opcao: ");
        int opcao = sc.nextInt();
     
        switch (opcao){
            case 1:
                System.out.print("Digite um numero: ");
                int n = sc.nextInt();
                if (n % 2 == 0){
                    System.out.println("Par");
                } else {
                    System.out.println("Impar");
                }    
                break;
                
            case 2:
                System.out.print("Digite um numero: ");
                int num = sc.nextInt();  
                int fat = 1;
                int i = 1;
                while (i <= num) {
                    fat = fat * i;
                    i = i + 1;
                }
                System.out.println("Fatorial: " + fat);
                break;
             
            case 3:
                System.out.println("Digite a largura: ");
                double largura = sc.nextDouble();
                System.out.println("Digite a altura: ");
                double altura = sc.nextDouble();
                double areaR = largura * altura;
                System.out.println("Resultado: " + areaR);
                break;
                
            case 4:
                System.out.println("Digite a base: ");
                double base = sc.nextDouble();
                System.out.println("Digite a altura: ");
                double alt = sc.nextDouble();
                double areaT = (base * alt) / 2;
                System.out.println("Resultado: " + areaT);
                break;
                
            case 5:
                System.out.println("Digite a nota 1: ");
                double n1 = sc.nextDouble();
                System.out.println("Digite a nota 2: ");
                double n2 = sc.nextDouble();
                System.out.println("Digite a nota 3: ");
                double n3 = sc.nextDouble();
                double media = (n1 + n2 + n3) / 3;
                System.out.println("Resultado: " + media);
                break;
        
            case 0: 
                System.out.print("Saindo");
                break;
        
            default:
                System.out.println("Opção inválida.");
                                        
        }
        sc.close();
    }
}