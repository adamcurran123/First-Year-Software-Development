//Import the Random Class
import java.util.Random;
public class JavaRandom1
{
	public static void main(String[] args)
	{
		//Create an instance of teh Random Class
		Random randomNumber = new Random();

		int num1;
		//Generate a random number and store in variable num1
		num1 = randomNumber.nextInt(10);

		System.out.println(num1);

	}
}