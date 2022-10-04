import java.util.Scanner;
public class JavaIfElse1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num1;

		System.out.print("Enter number: ");
		num1=keyboard.nextInt();

		System.out.println("num1 variable is: "+num1);

		if(num1>50)
		{
			System.out.println("Value is greater than 50!");
		}

		else
		{
			System.out.println("Value is less than 50!");
		}


	}
}
