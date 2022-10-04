import java.util.Scanner;
public class JavaIfElse4
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int userNumber;

		System.out.print("Enter a number: ");
		userNumber=keyboard.nextInt();

		if(userNumber==0)
		{
			System.out.println("The number you entered is 0");
		}
		if(userNumber>0)
		{
			System.out.println("The number you entered is positive");
		}
		if(userNumber<0)
		{
			System.out.println("The number you entered is negative");
		}
	}
}