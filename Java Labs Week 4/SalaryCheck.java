import java.util.Scanner
public class SalaryCheck
{
	public static void main(String[] args)
	{
		int sal
		String rate

		Scanner keyboard = new Scanner(System.in);

		System.out.println("Enter the current salary: ");
		sal = keyboard.nextInt();
		System.out.println("Enter the performance rating (Excellent, Good, or Poor): ");
		rate = keyboard.nextLine();

		System.out.println("Current salary is "+sal);


