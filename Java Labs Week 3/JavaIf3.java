import java.util.Scanner;
public class JavaIf3
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num1;

		System.out.print("Enter a number: ");
		num1 = keyboard.nextInt();

		if(num1 == 15)
		{
			System.out.println("Number is 15: ");
		}

		if(num1<15)
				{
					System.out.println("Number is lesser than 15");
		}

		if(num1>15)
				{
					System.out.println("Number is greater than 15");
		}
	}
}