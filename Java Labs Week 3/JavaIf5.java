import java.util.Scanner;
public class JavaIf5
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print("Enter your age: ");
		age = keyboard.nextInt();
	//Drivers License
		if(age ==16)
		{
			System.out.println("If you are "+age+" years old, you are old enough to get a driver's license!");
		}
		if(age>16)
		{
			System.out.println("If you are "+age+" years old, you are old enough to get a driver's license!");
		}
		if(age<16)
		{
			System.out.println("If you are "+age+" years old, you are not able to get a driver's license!");
		}

	//Facebook Account
        if(age ==13)
		{
			System.out.println("If you are "+age+" years old, you are old enough to make a Facebook account");
		}
		if(age>13)
		{
			System.out.println("If you are "+age+" years old, you are old enough to make a Facebook account");
		}
		if(age<13)
		{
			System.out.println("If you are "+age+" years old, you are not able to make a Facebook account");
		}

	//Vote
		if(age ==18)
		{
			System.out.println("If you are "+age+" years old, you are old enough to vote");
		}
		if(age>18)
		{
			System.out.println("If you are "+age+" years old, you are old enough to vote");
		}
		if(age<18)
		{
			System.out.println("If you are "+age+" years old, you are not able to vote");
		}
	//Buy Alcohol
		if(age ==13)
		{
			System.out.println("If you are "+age+" years old, you are old enough to buy alcohol");
		}
		if(age>13)
		{
			System.out.println("If you are "+age+" years old, you are old enough to buy alcohol");
		}
		if(age<13)
		{
			System.out.println("If you are "+age+" years old, you are not able to buy alocohol");
		}
	//TD
		if(age ==21)
		{
			System.out.println("If you are "+age+" years old, you are old enough to become a TD");
		}
		if(age>21)
		{
			System.out.println("If you are "+age+" years old, you are old enough to become a TD");
		}
		if(age<21)
		{
			System.out.println("If you are "+age+" years old, you are not able to become a TD");
		}
	//old
	    if(age ==50)
		{
			System.out.println("If you are "+age+" years old, you are OLD!");
		}
		if(age>50)
		{
			System.out.println("If you are "+age+" years old, you are OLD!");
		}
		if(age<50)
		{
			System.out.println("If you are "+age+" years old, you are not that old");
		}
	}
}





