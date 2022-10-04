import java.util.Scanner;
public class JavaWhile3
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	int number1 = 1;
	char word;


		System.out.println("Value of number variable is " +number1);

		System.out.print("Enter y to continue: ");
		word = keyboard.next().charAt(0);



	while (word == 'y')
	{
		System.out.println("Value of number variable is " +number1);

		System.out.print("Enter y to continue: ");
		word = keyboard.next().charAt(0);
		number1++;
	}
}
}
