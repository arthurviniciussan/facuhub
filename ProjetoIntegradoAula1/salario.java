import java.util.Scanner;
public class salario {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario: ");
        double salario = scan.nextDouble();
        System.out.println("Digite o percentual de aumento em %: ");
        double percentual = scan.nextDouble();
        percentual = 0.25;

        double salarioNovo = (salario * percentual) + salario;
        System.out.println("Apos o reajuste de" + percentual + "%");
        System.out.println("O novo salário será de " + salarioNovo);
    }
}
