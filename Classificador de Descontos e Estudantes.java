Cruza a idade e o status de estudante para determinar se o usuário é um estudante adulto, se tem desconto ou se entra em alguma categoria especial (como menores de 12 anos).




/**
 * @author Pedro ferrari
 * data de inicio 17/03/2026 
 * data de terrmino  17/03/2026
 * versão 1.0
 */
import java.util.Scanner;

public class Programa2 {
    public static void main(String[]args){
        Scanner entrada= new Scanner (System.in);
        
        System.out.print("Digite sua idade: ");
        int idade = entrada.nextInt();
        
        System.out.print("É estudante? (true/false): ");
        boolean estudante = entrada.nextBoolean();
         
        if(idade >= 18 && estudante){   
            System.out.println("Você é um estudante adulto.");
        }
        if (idade >= 18 || estudante){
            System.out.println("Você tem direito a desconto.");
        }
        if (idade >= 18 && estudante || idade < 12){
            System.out.println("Categoria especial.");
        }
    }
}