import java.util.Scanner;
public class JavaIf10
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

// 10% discount
		int qty;


		System.out.println("Enter quantity being purchased: ");
		qty = keyboard.nextInt();

		int fcost = qty*99;
		int dis= (fcost/10);
		int ocost = (fcost -dis);


		System.out.println("Cost is "+ocost);

		if(qty>10)
		{
			System.out.println("You received a discount of "+dis);
		}

		if(qty<=10)
		{
			System.out.println("There is no discount on this order");
		}

	}
}





