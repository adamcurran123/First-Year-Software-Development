import java.util.Scanner;
public class JavaLogicalOperators3
{
	public static void main(String[] args)
	{

		Scanner keyboard = new Scanner(System.in);

		int year;

		System.out.print("Enter year: ");
		year = keyboard.nextInt();

		System.out.println("Checking if Year "+year+" is outside the range for 20th century:");


		if (year<1901 | year>2000)
		{
			System.out.println("This year was not in the 20th century");
		}

		else
		{
			System.out.println("This year was in the 20th century");
		}
	}
}
