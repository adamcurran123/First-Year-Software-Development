import java.util.Scanner;
public class JavaWhile4
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	int num=0 ;
	int sum=0;


	while(num>=0)
	{
		System.out.print("Enter a number: ");
		num = keyboard.nextInt();

		sum = sum + num;
	}

	System.out.println("Sum of all numbers is: "+sum);


}
}

