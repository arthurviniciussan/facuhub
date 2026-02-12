import java.util.Scanner;
public class mediaponterada {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double nota1, nota2, nota3;
        double peso1, peso2, peso3;

        System.out.println("Digite as notas: ");
        nota1 = scan.nextDouble();
        nota2 = scan.nextDouble();
        nota3 = scan.nextDouble();
        System.out.println("Digite as pesos para as notas respectivamente: ");
        peso1 = scan.nextDouble();
        peso2 = scan.nextDouble();
        peso3 = scan.nextDouble();
        double pesos = peso1 + peso2 + peso3;
        double nota1nova = nota1 * peso1;
        double nota2nova = nota2 * peso2;
        double nota3nova = nota3 * peso3;
        double notas = nota1nova + nota2nova + nota3nova;

        double media = notas / pesos;
        String mediaformat = String.format("%.2f", media);
        System.out.println("A media ponderada vai ser: " + mediaformat);
    }
}
