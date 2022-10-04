import java.util.Scanner;
public class JavaIfElse7
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double score;

		System.out.print("Enter score number: ");
		score = keyboard.nextDouble();

		if(score<40)
		{
			System.out.println("Score of "+score+". Grade is E");
		}

		else if(score<49)
		{
			System.out.println("Score of "+score+". Grade is D");
		}

		else if(score<59)
		{
			System.out.println("Score of "+score+". Grade is C");
		}

		else if(score<69)
		{
			System.out.println("Score of "+score+". Grade is B");
		}

		else
		{
			System.out.println("Score of "+score+". Grade is A");
		}
	}
}
