Confere se o usuário tem a altura mínima (140 cm) e a idade mínima (10 anos) exigidas para entrar em um brinquedo.




/**
 *
 * @author Pedro ferrari
 * data de inicio 17/03/2026
 * data de termino 17/03/2026
 * versao 1.0
 */
import java.util.Scanner;

public class Programa4 {
    public static void main(String[] args){
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua altura (em cm):");
        double altura = entrada.nextDouble();
        
        System.out.println("Digite sua idade:");
        double idade = entrada.nextDouble();
        
        if (altura >= 140 && idade >= 10) {
            System.out.println("Pode entrar no brinquedo");
        }
        if (altura < 140 || idade < 10){
            System.out.println("Não pode entrar no brinquedo");
        }
    }
}