import java.util.Scanner; // Importa a classe Scanner para ler a entrada do usuário

public class AreaCircunferencia {

    public static void main(String[] args) {

        // Declaração de variáveis
        double raio;
        double area;

        // Cria um objeto Scanner para ler a entrada do teclado
        Scanner sc = new Scanner(System.in);

        // Pede ao usuário para digitar o valor do raio
        System.out.print("Digite o valor do raio: ");

        // Lê o valor do raio digitado pelo usuário
        raio = sc.nextDouble();

        // Calcula a área da circunferência
        // Usamos Math.PI para ter uma precisão maior do que 3.14159
        area = Math.PI * raio * raio;

        // Exibe o resultado na tela
        System.out.println("A área da circunferência é: " + area);

        // Fecha o objeto Scanner para liberar recursos
        sc.close();
    }
}