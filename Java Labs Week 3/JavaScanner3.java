import java.util.Scanner;
public class JavaScanner3
{
	public static void main(String[] args)
	{
		double num1;
		double num2;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter first number: ");
		num1=keyboard.nextInt();
		System.out.print("Enter second number: ");
		num2=keyboard.nextInt();

		System.out.println("------------------------------------");

		System.out.println("First number entered was: "+num1);
		System.out.println("First number entered was: "+num2);

		System.out.println("------------------------------------");

		double add = num1+num2;
		double avg = (add/2);

		System.out.println("Sum of the numbers entered is: "+add);
		System.out.println("Average of your numbers is: "+avg);

	}
}




