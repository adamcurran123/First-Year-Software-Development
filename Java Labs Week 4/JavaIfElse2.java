import java.util.Scanner;
public class JavaIfElse2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int temp;

		System.out.print("Enter temperature: ");
		temp=keyboard.nextInt();

		if (temp>25)
		{
			System.out.println("Its hot outside!");
		}
		else if(temp<5)
		{
			System.out.println("Its cold outside!");
		}
		else
		{
			System.out.println("Its okay outside!");
		}
	}
}