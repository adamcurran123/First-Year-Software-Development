import java.util.Scanner;
public class JavaFor10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int b;
		System.out.print("Enter a number to start: ");
		b = keyboard.nextInt();


		for(int a = b; a <= b+25 ; a++)
		{
			System.out.println(a);
		}
	}
}