import java.util.Scanner;
public class JavaScanner7
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	double num1;
	double num2;

	System.out.print("Enter first number: ");
	num1=keyboard.nextDouble();
	System.out.print("Enter second number: ");
	num2=keyboard.nextDouble();

	double add = num1+num2;
	double minus = num1-num2;
	double div = num1/num2;
	double mul = num1*num2;

	System.out.println("_____________________________________");

	System.out.println("Num1 + Num2 is: "+add);
	System.out.println("Num1 - Num2 is: "+minus);
	System.out.println("Num1 / Num2 is: "+div);
	System.out.println("Num1 * Num2 is: "+mul);

	System.out.println("________________________________");

	}
}

