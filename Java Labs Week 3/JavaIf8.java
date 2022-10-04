import java.util.Scanner;
public class JavaIf8
{
	public static void main(String[] args)
	{
		double num1;
		double num2;

	Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter first number: ");
		num1 = keyboard.nextDouble();

		System.out.println("Enter second number: ");
		num2 = keyboard.nextDouble();

		if(num1 == num2)
		{
			System.out.println("The 1st number "+num1+" is equal to the 2nd number "+num2);
		}

		if(num1 > num2)
		{
			System.out.println("The 1st number "+num1+" is greater than the 2nd number "+num2);
		}

		if(num1 < num2)
		{
			System.out.println("The 1st number "+num1+" is less than the 2nd number "+num2);
		}

	}
}
