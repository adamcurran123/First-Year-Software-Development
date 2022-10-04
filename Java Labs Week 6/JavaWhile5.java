import java.util.Scanner;
public class JavaWhile5
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	int num;


	System.out.print("Enter a number: ");
	num = keyboard.nextInt();


		while(0<num & num<50)
		{
			System.out.print("Enter a number: ");
			num = keyboard.nextInt();
		}
	}
}
