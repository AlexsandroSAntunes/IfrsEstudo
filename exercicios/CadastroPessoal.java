import java.util.Scanner;

public class CadastroPessoal{

  public static void main(String[] args)
 {
        int idade;
        String nome;
        double altura;
        boolean programacao;

        Scanner sc = new Scanner(System.in);

         System.out.println("Digite seu nome:");
         nome = sc.nextLine();
        
         System.out.println("digite sua idade:" );
         idade = sc.nextInt();
        
         System.out.println("Digite sua altura:" );
         altura = sc.nextDouble();

         System.out.println("Você gosta de programação? true/false:" );
         programacao = sc.nextBoolean();

        System.out.println("____Dados Cadastrais____");
        System.out.println("Seu nome é "+ nome);
        System.out.println("Sua idade é " + idade);
        System.out.println("Sua altura é " + altura);
        System.out.println("Você gosta de programação?  " + programacao);

         sc.close();
        
    }
}