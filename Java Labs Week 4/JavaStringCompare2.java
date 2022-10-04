import java.util.Scanner;
public class JavaStringCompare2
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String user;
		String pass;

		System.out.println("Enter username: ");
		user = keyboard.nextLine();

		System.out.println("Enter password: ");
		pass = keyboard.nextLine();

		if (user.equals("adam") && pass.equals("bob"))
		{
			System.out.println("_________________________________________________");
			System.out.println("  S Y S T E M	A C C E S S	 G R A N T E D");
			System.out.println("_________________________________________________");
		}
		else
		{
			System.out.println("_________________________________________________");
			System.out.println("  S Y S T E M	A C C E S S	 D E N I E D");
			System.out.println(" Username or password incorrect ");
			System.out.println("_________________________________________________");
		}

	}
}

