import java.util.Scanner;

public class Media {
     public static void main(String[] args) {
        double n1, n2, n3, n4, media;

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        n1 = sc.nextDouble();

        System.out.println("Digite o segundo número");
        n2 = sc.nextDouble();

        System.out.println("Digite o terceiro número:");
        n3 = sc.nextDouble();

        System.out.println("Digite o quarto número:");
        n4 = sc.nextDouble();

        media = (n1 + n2 + n3 + n4) / 4;

        System.out.println("A média é:" + media);
 sc.close();
 

}

}