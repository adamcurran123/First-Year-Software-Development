import java.util.*;
public class JavaForBonus5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();


	//Outer loop
	for(int j = 1; j<= 10; j++)
	{
		//Inner Loop
		for(int i = 1; i<=j; i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}