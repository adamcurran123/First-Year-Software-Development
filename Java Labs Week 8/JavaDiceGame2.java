import java.util.*;
public class JavaDiceGame2
{
	public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			Random randomNumber = new Random();

			System.out.println("Lucky Dice Game!");

			int dice;
			int dice2;
			int guess;

			dice = randomNumber.nextInt(6)+1;
			dice2 = randomNumber.nextInt(6)+1;

			int add= dice+dice2;

			System.out.println("Place your bets!!");
			System.out.print("Whats your bet?: ");
			guess = keyboard.nextInt();

			System.out.println("Dice 1: "+dice);
			System.out.println("Dice 2: "+dice2);

			if(add == guess)
			{
				System.out.println("You won!");
			}
			else
			{
				System.out.println("Aw. You lost. Better luck next time.");
			}
		}
	}