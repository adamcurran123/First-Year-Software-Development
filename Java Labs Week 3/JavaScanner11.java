import java.util.Scanner;
public class JavaScanner11
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String first;
		String last;
		int ID;
		int salary;
		double taxrate;

		System.out.print("Enter first name: ");
		first = keyboard.nextLine();
		System.out.print("Enter last name: ");
		last = keyboard.nextLine();
		System.out.print("Enter Employee ID: ");
		ID = keyboard.nextInt();
		System.out.print("Enter Salary: ");
		salary = keyboard.nextInt();
		System.out.print("Enter Current Tax Rate: ");
		taxrate = keyboard.nextDouble();

		double prsi=(salary/100)*taxrate;
		double take=(salary-prsi);
		double monthly=(take/12);

		System.out.println("|--------------------------------------|");
		System.out.println("| PAYSLIP                              ");
		System.out.println("|--------------------------------------|");
		System.out.println("| EMPLOYEE:"+first+last);
		System.out.println("| ID: "+ID);
		System.out.println("| Salary: " +salary);
		System.out.println("| PRSI: "+prsi);
		System.out.println("|ANNUAL TAKE HOME: "+take);
		System.out.println("|MONTHLY TAKE HOME: "+monthly);
		System.out.println("|--------------------------------------|");



	}
}

