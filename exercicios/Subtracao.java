import java.util.Scanner;

public class Subtracao {
    public static void main(String[] args) {
       
        int numero1;
        int numero2;
        int subtracao;
        Scanner sc = new Scanner( System.in);
          
        System.out.print("Digite o Primeiro número:");
        numero1 = sc.nextInt();
        
        System.out.print("digiteo Segundo número:");
        numero2 = sc.nextInt();
        subtracao = numero1 - numero2;

        System.out.println("Resultado da subtração: " + subtracao);

        sc.close();
    }
}