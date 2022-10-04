import java.util.Scanner;
public class JavaFor5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int i;

		System.out.println("Counter Program");
		System.out.println("This program will count from zero up to whatever number you enter.");
		System.out.print("\n\nEnter a number to count up to: ");
		i = keyboard.nextInt();



		for(int a = 0; a <= i; a++)
		{
			System.out.println(a);
		}
	}

}
