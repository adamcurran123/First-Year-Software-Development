import java.util.Scanner;
public class JavaIf7
{
	public static void main(String[] args)
	{
		double first;
		double second;
		double choice;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter first number: ");
		first = keyboard.nextDouble();

		System.out.print("Enter second number: ");
		second = keyboard.nextDouble();

		System.out.println("Would you like to add(1), subtract(2), divide(3), multiply(4) or get the modulo(5)? ");
		choice = keyboard.nextDouble();

		double add = (first + second);
		double subt =(first - second);
		double div =(first/second);
		double mult =(first*second);
		double modulo =(first%second);

		if(choice == 1)
		{
			System.out.println("Answer is: "+add);
		}

		if(choice == 2)
		{
			System.out.println("Answer is: "+subt);
		}

		if(choice == 3)
		{
			System.out.println("Answer is: "+div);
		}

		if(choice == 4)
		{
			System.out.println("Answer is: "+mult);
		}

		if(choice == 5)
		{
			System.out.println("Answer is: "+modulo);
		}
	}
}