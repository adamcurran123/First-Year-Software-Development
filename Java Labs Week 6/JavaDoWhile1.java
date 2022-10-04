import java.util.Scanner;
public class JavaDoWhile1
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	int number1 ;
	char word;


		System.out.print("Enter a number: ");
		number1 = keyboard.nextInt();


		if(number1 % 2 == 0)
		{
			System.out.println("Number is even");
		}
		else
		{
			System.out.println("Number is odd");
		}



		System.out.print("Enter y to continue: ");
		word = keyboard.next().charAt(0);



	while (word == 'y')
	{


				System.out.print("Enter a number: ");
				number1 = keyboard.nextInt();


				if(number1 % 2 == 0)
				{
					System.out.println("Number is even");
				}
				else
				{
					System.out.println("Number is odd");
				}



				System.out.print("Enter y to continue: ");
				word = keyboard.next().charAt(0);


	}
}
}