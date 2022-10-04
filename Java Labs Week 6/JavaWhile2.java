import java.util.Scanner;
public class JavaWhile2
{
	public static void main(String[] args)
	{
		int test ;
		String word ;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("What word(s) will be output: ");
		word = keyboard.nextLine();

		System.out.print("Enter number of times word should be printed: ");
		test = keyboard.nextInt();

		while (test>0)
		{
			System.out.println(word);
			test--;
		}
	}
}