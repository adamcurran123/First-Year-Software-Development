import java.util.Scanner;
public class RandomProgram
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double num;

		System.out.print("Input value: ");
		num = keyboard.nextDouble();

		if(num<0)
		{
			System.out.println("Negative number");
		}

		else if(num>0 && num<1)
		{
			System.out.println("Positive small number");
		}
		else if(num>0 && num>1000000)
		{
			System.out.println("Positive large number");
		}
		else if(num==0)
		{
			System.out.println("Zero");
		}
		else
		{
			System.out.println("Positive number");
	}

	}


}
