import java.util.Scanner;
public class JavaIf6
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int num;

		System.out.print("Enter number: ");
		num = keyboard.nextInt();

		if(num>=0)
		{
			System.out.println("Number you entered is 100 or greater!");
		}
		if(num<0)
		{
			System.out.println("Number you entered is less than 100!");
		}
	}
}