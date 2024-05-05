package program;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Application {

	public static void main(String[] args) {
	try {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data: ");
		System.out.print("Number: ");
		int numberAccount = sc.nextInt();
		sc.nextLine();
		System.out.print("Holder: ");
		String holder = sc.nextLine();
		System.out.print("Initial balance: ");
		Double balance = sc.nextDouble();
		System.out.print("Withdraw limit: ");
		Double withdrawLimit = sc.nextDouble();
		Account ac = new Account(numberAccount, holder, balance, withdrawLimit);
		
		System.out.print("Enter amount for withdraw:");
		Double withdraw = sc.nextDouble();
		ac.withdraw(withdraw);
		
		System.out.println(ac);

	}
	catch(RuntimeException re) {
		System.out.println("This answer do not support the caractere that you used it.");
	} catch (DomainExceptions e) {
		System.out.println("Error: " + e.getMessage());
	}
	
	}

}
