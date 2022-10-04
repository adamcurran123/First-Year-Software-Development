import java.util.*;
public class JavaForBonus2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();

		int wid;
		int hgt;

		System.out.println("\nEnter width of rectangle: ");
		wid = keyboard.nextInt();
		System.out.println("\nEnter height of rectangle: ");
		hgt = keyboard.nextInt();

		for(int i = 1; i<=hgt; i++)
		{

			for(int x = 1; x<= wid; x++)
			{
				System.out.print("*");
			}

			System.out.print("\n");

		}
	}
}