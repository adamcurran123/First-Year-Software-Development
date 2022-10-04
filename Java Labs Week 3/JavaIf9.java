import java.util.Scanner;
public class JavaIf9
{
	public static void main(String[] args)
	{

		int num1;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter number: ");
		num1=keyboard.nextInt();

		int num2= num1%2;

		if(num2 == 1)
		{
			System.out.println("Number is odd!");
		}

		if(num2 == 0)
		{
			System.out.println("Number is even!");
		}
	}
}