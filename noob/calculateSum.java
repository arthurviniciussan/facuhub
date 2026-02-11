package noob;

public class calculateSum {
	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50};
		int size = arr.length;
		int i = 0;
		int res = 0;
		while (i < size)
		{
			res += arr[i];
			i++;
		}
		System.out.println("A soma do array vai ser: " + res);
	}
}