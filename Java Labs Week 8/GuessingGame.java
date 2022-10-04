import java.util.*;
public class GuessingGame
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		Random randomNumber = new Random();
		int guess;
		int num;
		num = randomNumber.nextInt(100)+1;

		for(int i = 0; i<=6; i++)
		{
			System.out.println("Guess a number between 1 and 100: ");
			guess = keyboard.nextInt();
			if(guess > num)
			{
				System.out.println("Too High");
			}
			else if(guess < num)
			{
				System.out.println("Too Low");
			}
			else if(guess == num)
			{
				System.out.println("\n!!!Congratulations you win!!!");
				i = 7;
			}
			if(i == 6)
			{
				System.out.println("Sorry, you didn't win. The answer was "+num);
			}
		}
	}
}

