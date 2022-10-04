import java.util.Scanner;
public class JavaIf4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int n1;

		System.out.println("POSITIVE OR NEGATIVE NUMBER CHECKER! |");
		System.out.println("------------------------------------ |");

		System.out.print("Enter your number: ");
		n1 = keyboard.nextInt();

		if(n1>0)
		{
			System.out.println("Value of your number is "+n1+", that number is positive!");
		}
		if(n1<0)
		{
			System.out.println("Value of your number is "+n1+", that number is negative!");
		}
		if(n1==0)
		{
			System.out.println("Value of your number is "+n1+", that number is positive!");
		}
	}
}


