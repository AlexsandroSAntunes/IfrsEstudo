import java.util.Scanner;

public class MiniCalculadora {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        String nome1, nome2;
        int idade1, idade2;
        double altura1, altura2;
        
        System.out.println("digite o nome da primeira pessoa:");
        nome1 = sc.nextLine();

        System.out.println("digite a idade da primeira pessoa:");
        idade1 = sc.nextInt();

        System.out.println("digite a altura da primeira pessoa:");
        altura1 = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("digite o nome da segunda pessoa:");
        nome2 = sc.nextLine();

        System.out.println("digite a idade da segunda pessoa");
        idade2 = sc.nextInt();

        System.out.println("digite a altura da segunda pessoa:");
        altura2 = sc.nextDouble();



        double mediaIdade = (idade1 + idade2) / 2.0;
        double mediaAltura = (altura1 + altura2) / 2.0;

        System.out.println("Nome da primeira pessoa :"+nome1);
        System.out.println("Nome da segunda pessoa :"+nome2);
        System.out.println("Media das idades:" + mediaIdade);
        System.out.println("Media das alturas:" +mediaAltura);
        
        sc.close();
    }
}