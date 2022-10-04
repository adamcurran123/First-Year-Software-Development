import java.util.Scanner;
public class JavaStringCompare1
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		String first;
		String second;

		System.out.print("Enter first name: ");
		first=keyboard.nextLine();

		System.out.print("Enter second name: ");
		second=keyboard.nextLine();

		if (first == second)
		{
			System.out.println(first+ " and " +second+ " are equal");
		}

		if (first != second)
		{
			System.out.println(first+" and "+second+" are different");
		}
	}
}

