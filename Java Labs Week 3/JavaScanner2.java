import java.util.Scanner;
public class JavaScanner2
{
	public static void main(String[] args)
	{
		int num1;
		int num2;
		int num3;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Please enter 1st integer: ");
		num1 = keyboard.nextInt();
		System.out.print("Please enter 2nd integer: ");
		num2 = keyboard.nextInt();
		System.out.print("Please enter 3rd integer: ");
		num3 = keyboard.nextInt();


		System.out.println("First number entered was: "+ num1);
		System.out.println("Second number entered was: "+ num2);
		System.out.println("Third number entered was: "+ num3);
	}
}