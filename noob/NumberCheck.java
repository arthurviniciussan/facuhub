package noob;

public class NumberCheck {

	public static void main(String[] args){
		for (int i = 1; i < 100; i++){
			if (i % 2 == 0) {
				System.out.println("Even:" + i + "\n");
			}
			else {
				System.out.println("Odd:" + i + "\n");
			}
		}
	}
}
