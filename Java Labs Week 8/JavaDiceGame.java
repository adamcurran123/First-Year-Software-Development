import java.util.*;
public class JavaDiceGame
{
	public static void main(String[] args)
	{
			Scanner keyboard = new Scanner(System.in);
			Random randomNumber = new Random();

			System.out.println("Lucky Dice Game!");

			int dice;
			int guess;

			dice = randomNumber.nextInt(6)+1;

			System.out.print("Place your bets!!\nWhat side will the dice land on?: ");
			guess = keyboard.nextInt();

			if(dice == guess)
			{
				System.out.println("You won!");
			}
			else
			{
				System.out.println("Aw. You lost. Better luck next time.");
			}
		}
}