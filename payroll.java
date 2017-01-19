import java.util.Scanner;

public class payroll {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		String name;
		double hours, hrPay, totalPay, fedTax, stateTax;

		System.out.print("Enter employee's name: ");
		name = in.next();

		System.out.print("\nEnter number of hours worked in a week: ");
		hours = in.nextDouble();

		System.out.print("\nEnter hourly pay rate: ");
		hrPay = in.nextDouble();

		System.out.print("\nEnter federal tax withholding rate: ");
		fedTax = in.nextDouble();

		System.out.print("\nEnter state tax withholding rate: ");
		stateTax = in.nextDouble();

		System.out.print("\nEmployee Name: " + name);
		System.out.print("\nHours Worked: " + hours);
    System.out.print("\nPay Rate: " + hrPay);
		totalPay = hrPay * hours;
    System.out.print("\nGross Pay: " + totalPay);
    System.out.print("\nDeductions:");
    System.out.print("\n\tFederal Withholding (" + fedTax * 100 + "%): $" + fedTax * totalPay);
    System.out.print("\n\tState Withholding (" + stateTax * 100 + "%): $" + stateTax * totalPay);
    System.out.print("\n\tTotal Deduction: $" + (fedTax + stateTax) * totalPay);
    System.out.print("\nNet Pay : $" + (totalPay - (totalPay * (fedTax + stateTax))));//excessive parens are sacrifices to the compiler
	}
}
		
