import java.util.Scanner;
public class JavaScanner12
{
	public static void main(String[] args)
	{
		String ctry;
		int pop;
		int area;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Population Density Calculator!");
		System.out.println("--------------------------------------");
		System.out.print("Enter country name: ");
		ctry = keyboard.nextLine();
		System.out.print("Enter country population: ");
		pop = keyboard.nextInt();
		System.out.print("Enter country area in square KM: ");
		area = keyboard.nextInt();

		int ppsk = pop/area;

		System.out.println("--------------------------------------");

		System.out.println("Ireland has "+ppsk+" people per square kilometer");
	}
}
