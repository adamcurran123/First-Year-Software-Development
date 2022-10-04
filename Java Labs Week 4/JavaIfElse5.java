import java.util.Scanner;
public class JavaIfElse5
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	int firstNum;
	int secondNum;

	System.out.print("Enter first number: ");
	firstNum = keyboard.nextInt();

	System.out.print("Enter second number: ");
	secondNum = keyboard.nextInt();

	if (firstNum<secondNum)
	{
		System.out.println("The second number is greater than the first number");
	}
	else if (firstNum>secondNum)
	{
		System.out.println("The first number is greater than the second number");
	}
	else
	{
		System.out.println("The numbers are equal!");
	}
}
}




