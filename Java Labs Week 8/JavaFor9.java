import java.util.Scanner;
public class JavaFor9
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		int b;
		int a;

		System.out.print("Enter a number to start: ");
		b = keyboard.nextInt();
		System.out.print("Enter a number to finish: ");
		a = keyboard.nextInt();

		for(int i = b; i<= a; i++)
		{
			System.out.println(i);
		}
	}
}