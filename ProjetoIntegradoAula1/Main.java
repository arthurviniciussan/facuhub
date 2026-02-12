//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = {2, 9, 0, 7, 20, 39};
        int soma = 0;
        int soma2 = 0;
        int i = 0;
        while (i < arr.length){
            soma2 += arr[i];
            i++;
        }
        for (int num : arr) {
            soma += num;
        }
        System.out.println(soma);
        System.out.println(soma2);
        }
    }
