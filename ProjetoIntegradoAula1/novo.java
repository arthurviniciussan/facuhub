import java.util.Scanner;

public class novo {

    public static  void main(String[] args){
        int num1, num2, num3, num4,soma;
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite 4 números para somar");
        num1 = scan.nextInt();
        num2 = scan.nextInt();
        num3 = scan.nextInt();
        num4 = scan.nextInt();
        soma = num1 + num2 + num3 + num4;
        System.out.println("A soma dos números é: " + soma);
    }
}
