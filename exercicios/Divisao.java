import java.util.Scanner;

public class Divisao{
    public static void main(String[] args) {
        int numero1;
        int numero2;
        int divisao;
        Scanner sc = new Scanner (System.in);
        System.out.println("Digite o Primeiro número:");
        numero1 = sc.nextInt();
        System.out.println("Digite o Segundo número:");
        numero2 = sc.nextInt();
        divisao = numero1 / numero2;
        System.out.println("Resultado da divisão: " + divisao);
        sc.close();
}
}