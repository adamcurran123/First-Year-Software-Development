import java.util.Scanner;
public class JavaLogicalOperators2
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int amount1;
		int amount2;

		System.out.print("Enter amount 1: ");
		amount1=keyboard.nextInt();
		System.out.println("Enter amount 2: ");
		amount2=keyboard.nextInt();

		System.out.println("Amount 1: "+amount1);
		System.out.println("Amount 2: "+amount2);

		if (amount1>10 && amount2<100)
		{
			System.out.println("Amount 1 is greater than 10!");
			System.out.println("Amount 2 is less than 100!");
		}
	}
}
