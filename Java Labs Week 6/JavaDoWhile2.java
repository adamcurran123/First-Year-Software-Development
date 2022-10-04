import java.util.Scanner;
public class JavaDoWhile2
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

		String password;

		System.out.print("Enter password: ");
		password = keyboard.nextLine();


			while(!password.equals("mypass"))
			{
				System.out.print("Enter password: ");
				password = keyboard.nextLine();

			}

		System.out.println("Access granted!");
	}
}