import java.util.Scanner;
public class ThreeNumbers
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int num1;
		int num2;
		int num3;

		System.out.print("Input 1st number: ");
		num1 = keyboard.nextInt();
		System.out.print("Input 2nd number: ");
		num2 = keyboard.nextInt();
		System.out.print("Input 3rd number: ");
		num3 = keyboard.nextInt();

		if(num1>num2 && num1>num3)
		{
			System.out.println("Biggest number is "+num1);
		}
		else if(num2>num1 && num2>num3)
		{
			System.out.println("Biggest number is "+num2);
		}
		if(num3>num1 && num3>num2)
		{
			System.out.println("Biggest number is "+num3);
		}
	}
}