import java.util.Scanner;
public class salariobase {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o salario base: ");
        double salarioBase = scan.nextDouble();
        System.out.println("Com a gratificação de 5% no próximo mês e pagando 7% de imposto");
        double salarioBaseNovo = salarioBase + (salarioBase * 0.05) - (salarioBase * 0.07);
        System.out.printf("Seu próximo salário será: %.2f", salarioBaseNovo);
    }
}
