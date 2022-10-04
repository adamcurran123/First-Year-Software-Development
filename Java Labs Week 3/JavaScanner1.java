import java.util.Scanner;
public class JavaScanner1
{
	public static void main(String[] args)
	{
	int number1;
	Scanner keyboard = new Scanner(System.in);

	System.out.print("Please enter an integer: ");
	number1 = keyboard.nextInt();

	System.out.println("The number inputed was: "+number1);

	}
}
