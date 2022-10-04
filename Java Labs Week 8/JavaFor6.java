import java.util.Scanner;
public class JavaFor6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);


		int a;

		System.out.println("\n\t\tMultiplication Table\n\n");
		System.out.print("Enter a number to generate multiplication tables for: ");
		a = keyboard.nextInt();

		for(int i = 1; i<= 10; i++)
		{
					System.out.println(a+" times "+i+" is "+(i*a));
		}


	}
}