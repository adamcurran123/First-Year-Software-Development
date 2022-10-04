import java.util.Scanner;
public class UpDown
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.print("Input 1st number: ");
		num1 = keyboard.nextInt();
		System.out.print("Input 2nd number: ");
		num2 = keyboard.nextInt();
		System.out.print("Input 3rd number: ");
		num3 = keyboard.nextInt();


		if(num1>num2 && num2>num3)
		{
			System.out.println("Numbers are decreasing in size!");
		}
		if(num1<num2 && num2<num3)
		{
			System.out.println("Numbers are increasing in size!");
		}
	    else
		{
			System.out.println("Neither increasing or decreasing order");
		}
	}
}
