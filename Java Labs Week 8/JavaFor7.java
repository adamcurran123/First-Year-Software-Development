import java.util.Scanner;
public class JavaFor7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int a;
		System.out.print("Enter a number: ");
		a = keyboard.nextInt();



		for(int i = 0;  i<100 ; i=i+a)
		{
			System.out.println(i);
		}
	}
}