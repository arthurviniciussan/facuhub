import  java.util.Scanner;
public class juros {
    public static  void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double dinheiro = 100;
        System.out.printf("Sua conta: %.2f\n", dinheiro);
        System.out.println("Digite o quanto vai depositar: ");
        double depoisito = scan.nextDouble();
        System.out.println("Digite o percentual de juros em %: ");
        double juros = scan.nextDouble();

        System.out.printf("Com o aumento de %.0f porcento  no seu deposito de %.2f\n", juros,depoisito);
        juros = juros / 100;
        dinheiro = depoisito + (depoisito * juros);
        System.out.println("O valor da sua conta será de: " + dinheiro);
    }
}
