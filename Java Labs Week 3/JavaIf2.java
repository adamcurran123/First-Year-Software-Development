//Less than more than 0 programme (TEST)
import java.util.Scanner;
public class JavaIf2
{
	public static void main(String[] args)
	{

		int num1;
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter a number: ");
		num1 = keyboard.nextInt();


		if(num1>0)
		{
			System.out.println("Number is greater than zero!");
		}
		if(num1<0)
		{
			System.out.println("Number is less than zero!");
		}
		if(num1==0)
		{
			System.out.println("Number is 0!");
		}
	}
}