import java.util.Scanner;

public class CadastroAtualizado {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        String nome;
        int idade;
        double altura;
        int totalIdade = 0;
        double totalAltura = 0;
        int contador = 0;

        while (true){
            System.out.print("Digite o seu nome: ");
            nome = sc.nextLine();

            System.out.print("Digite a sua idade: ");
            idade = sc.nextInt();

            System.out.print("Digite a sua altura: ");
            altura = sc.nextDouble();
            sc.nextLine();

            totalIdade += idade;
            totalAltura += altura;
            contador++;

            System.out.print("Deseja cadastrar outra pessoa (s/n)? ");
            String resposta = sc.nextLine();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }

        double mediaIdade = (double) totalIdade / contador;
        double mediaAltura = totalAltura / contador;

        System.out.println("\n===== Resumo Final =====");
        System.out.printf("Total de pessoas cadastradas: %d%n", contador);
        System.out.printf("Média das idades: %.2f%n", mediaIdade);
        System.out.printf("Média das alturas: %.2f%n", mediaAltura);

        sc.close();
    }
}
