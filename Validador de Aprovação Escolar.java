Avalia a nota e a frequência do aluno. Se ele tiver nota acima de 6 e frequência acima de 75%, é aprovado; caso contrário, fica em situação de risco.



/**
 * @author Pedro ferrari
 * data de inicio 17/03/2026 
 * data de terrmino  17/03/2026
 * versão 1.0
 */
import java.util.Scanner;

public class Programa3 {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner (System.in);
            
        System.out.println("Digite sua nota:");
        double nota = entrada.nextDouble();
        
        System.out.println("Digite sua frequência:");
        double frequência = entrada.nextDouble();
        
        if (nota >= 6 && frequência >= 75 ) {
            System.out.println("Você foi aprovado");
        }
        
        if (nota < 6 || frequência < 75){
            System.out.println("Você está em situação de risco");
        }
    }   
}