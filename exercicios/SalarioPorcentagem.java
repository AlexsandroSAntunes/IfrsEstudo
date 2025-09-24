import java.util.Scanner;

public class SalarioPorcentagem {
    public static void main(String[] args) {

        double salario, porcentagem,aumento, novoSalario;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o salario atual:");
        salario = sc.nextDouble();
        
        System.out.println("Digite o percentual de aumento:");
        porcentagem = sc.nextDouble();
        
        aumento = (salario* porcentagem)/100;
        novoSalario = salario + aumento;
        
        System.out.println("O novo salario é:" + novoSalario);
        sc.close();
    }
}
