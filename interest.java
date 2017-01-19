import java.util.Scanner;

public class interest{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter initial investment: \n");
		int investment;
		investment = input.nextInt();

		System.out.print("\nEnter interest rate as a decimal: \n");
		double rate;
		rate = input.nextDouble();

		System.out.print("\nEnter length of investment (years):\n");
		int years;
		years = input.nextInt();

		double amount;
		amount = investment * Math.pow(1 + rate, years);
		System.out.print("Your investment will be worth " + amount + " at the end of " +years + " years.");
	}
}
