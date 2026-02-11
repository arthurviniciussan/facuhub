package noob;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to your bank account!\n");

    System.out.println("What is your account number?\n");
    String accountNumber = scan.nextLine();

    System.out.println("How much do you have?\n");
    double amount = scan.nextDouble();

		
    BankAccount p1 = new BankAccount(accountNumber, amount);
		System.out.println("Great!\n");
		boolean running = true;

while (running) {

    System.out.println("\nNow, what do you want to do?");
    System.out.println("1 - Deposit");
    System.out.println("2 - Withdraw");
    System.out.println("3 - Show balance");
    System.out.println("4 - Exit");

    int option = scan.nextInt();

    switch (option) {

        case 1:
            System.out.println("How much do you want to add?");
            double add = scan.nextDouble();
            p1.deposit(add);
            break;

        case 2:
            System.out.println("How much do you want to withdraw?");
            double draw = scan.nextDouble();
            p1.withdraw(draw);
            break;

        case 3:
            p1.show();
            break;

        case 4:
            System.out.println("Thanks for coming! Goodbye!");
            running = false;
            break;

        default:
            System.out.println("Invalid option");
    }
}
		scan.close();
	}

	 static class BankAccount {
		 private String accountNumber;
		 private Double amount;

		public BankAccount(String accountNumber, Double amount){
			this.accountNumber = accountNumber;
			this.amount = amount;
		}

		public void deposit(double add){
			this.amount += add;
			System.out.println("Deposit successful");
		}

		public void withdraw(double draw){
			if (draw > amount){
				System.out.println("You don't have money...");
			} else {
			this.amount -= draw;
				System.out.println("Withdraw successful");
			}
			}

		public void show(){
			System.out.println("Your account: " + accountNumber + "\n");
			System.out.println("Has now " + amount + "USD");
		}
	}
}
