import java.util.Scanner;
public class JavaScanner6
{
	public static void main(String[] args)
	{
		double price;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter Price of Product: ");
		price=keyboard.nextDouble();

		double vat=(price*0.23);
		double finalPrice= vat+price;

		System.out.println("________________________________");
		System.out.println("Price of product is: "+price);
		System.out.println("VAT at 23% is: "+vat);
		System.out.println("TOTAL COST: "+finalPrice);
	}
}






