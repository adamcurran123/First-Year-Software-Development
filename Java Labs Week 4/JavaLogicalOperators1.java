import java.util.Scanner;
public class JavaLogicalOperators1
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int temp;

		System.out.print("Enter temperature: ");
		temp = keyboard.nextInt();

		System.out.println("Current temperature is "+temp);

		if(temp<-10)
		{
			System.out.println("Current temperature is outside the normal range");
		}

		else if(temp>30)
		{
			System.out.println("Current temperature is outside the normal range");
		}
		else
		{
			System.out.println("Current temperature is within the normal range");
		}
	}
}


