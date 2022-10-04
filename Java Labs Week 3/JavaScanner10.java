import java.util.Scanner;
public class JavaScanner10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String name;
		int birth;
		int current=2021;

		System.out.print("Please enter your name: ");
		name = keyboard.nextLine();
		System.out.print("Please enter your year of birth: ");
		birth = keyboard.nextInt();

		int age = current-birth;


		System.out.println("Greetings, "+ name+ "!");
		System.out.println("You were born in "+birth+" and therefore you are "+age+" years old");
	}
}