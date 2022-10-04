import java.util.*;
public class JavaForBonus4
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		int num;
		int num2;
		int score = 0;
		System.out.println("Type in the answer of the equation.");


		int ans;

		for(int i = 0; i <= 9; i++)
		{
			num = randomNumber.nextInt(30)+5;

			num2 = randomNumber.nextInt(30)+5;
			System.out.print(num+ " + "+num2+" = ");
			ans = keyboard.nextInt();
			int add = num + num2;
			if(ans == add)
			{
				score++;
			}

		}
			System.out.println("Well done! You got "+score+" correct!");

	}
}