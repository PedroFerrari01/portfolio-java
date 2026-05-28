Verifica se o usuário tem 18 anos ou mais e possui carteira para saber se pode dirigir.


/**
 * @author Pedro ferrari
 * data de inicio 17/03/2026 
 * data de terrmino  17/03/2026
 * versão 1.0
 */
import java.util.Scanner;        

public class Programaif1 {
    public static void main(String [] args){
        
        Scanner entrada = new Scanner (System.in);
        System.out.print ("Digite Sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("Possui carteira de motorista? (true/false): ");
        boolean carteira = entrada.nextBoolean ();
        
        if (idade >= 18 && carteira == true) {
            System.out.println("Pode dirigir");
        }
        if (idade < 18 || carteira == false){
            System.out.println("Não pode dirigir");
        }
    }
}