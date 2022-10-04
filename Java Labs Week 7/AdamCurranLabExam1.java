
//Adam Curran G00407852
//09-11-2021
import java.util.Scanner;
public class AdamCurranLabExam1
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

//Declare variables
		String password;
		byte select;
		String name ;
		int night = 0;
		char coup;
		char loop = 'y';
		int number = 0;
//Prompt user to enter in password which is checked to see if it is correct
		System.out.println("\t---------------------------------------");
		System.out.println("\t\tThe Galways Guesthouse");
		System.out.println("\t---------------------------------------");
		System.out.print("\n\nEnter username: ");
		password = keyboard.nextLine();
//Print the relative message for each user
			if(password.equalsIgnoreCase("Owner"))
			{
				System.out.println("WELCOME TO THE HOTEL BOOKING SYSTEM - You are the OWNER");
			}

			else if(password.equalsIgnoreCase("Manager"))
			{
				System.out.println("WELCOME TO THE HOTEL BOOKING SYSTEM - You are the MANAGER");
			}

			else
			{
				System.out.println("WELCOME TO THE HOTEL BOOKING SYSTEM");
			}
//Print the menu for user to select action from

			while(loop==('y'))
			{
			System.out.println("\n\n======== SYSTEM OPTIONS ===========");
			System.out.println("1. Guest Check-in");
			System.out.println("2. Reservations");
			System.out.println("3. Generate Bill");
			System.out.println("4. View all reservations");
			System.out.println("5. Show Used Room Count");
			System.out.println("6. Purchase Items");
			System.out.println("===================================");
			System.out.print("Specify item 1, 2, 3, 4, 5 or 6: ");
			select = keyboard.nextByte();

//Show user the menu screen they selected(1)

			if(select==1)
			{
				System.out.println("==========Guest Check In=========");

				System.out.println("Enter name: ");
				name = keyboard.nextLine();

				System.out.print("Number of nights: ");
				night = keyboard.nextInt();

				System.out.print("Discount Coupon(Y or N): ");
				coup = keyboard.next().charAt(0);

				float cost = night*75;
				double disc = cost*0.85;
//determine wether you should apply a discount to booking or not
				if(coup==('y'))
				{
					System.out.println("Cost per night: 75");
					System.out.printf("%d nights @ 75 euros per night is %f", night, cost);
					System.out.println("\n15% discount applied with valid coupon:");
					System.out.printf("Total Cost is %f", disc);
				}

				else
				{
					System.out.println("Cost per night: 75");
					System.out.printf("%d nights @ 75 euros per night is %f", night, cost);
					System.out.printf("Total Cost is %f", cost);
					System.out.print("Enter Y to return to main menu or N to quit: ");
					loop = keyboard.next().charAt(0);

				}
				number++;
			}
//Show user the menu screen they selected(2)

		   	else if(select==2)
			{
				System.out.println("==========Reservations=========");
//System.out.printf("Name: %s", name);  could not get the variable in this line to initialize
				System.out.printf("\nNights: %d\n", night);
				System.out.print("Enter Y to return to main menu or N to quit: ");
				loop= keyboard.next().charAt(0);
			}
//show user the menu screen the seleced(5) shows how many rooms are booked using increments
			else if(select==5)
			{
				System.out.println("======Room Count=======");
				System.out.println("Number of rooms booked:"+number);
				System.out.println("=======================");
			}

//show user the menu screen they selected(6) shop which gives different
//prices based of wether the customer is a guest or not
			else if(select==6)
			{
				char choice;
				char guest;

				System.out.println("======== PURCHASE ITEMS =========");
				System.out.println("Enter item for purchase:");
				System.out.println("Enter P for Pepsi");
				System.out.println("Enter C for Coke");
				System.out.println("Enter N for no purchase");
				System.out.print("Enter Item for purchase: ");
				choice = keyboard.next().charAt(0);
				System.out.print("Is this a hotel guest? Y or N: ");
				guest = keyboard.next().charAt(0);

				if(choice==('p')&& guest==('y'))
				{
					System.out.println("Price for Pepsi for this customer is 1.00 euro");
				}

				else if(choice==('p')&& guest==('n'))
				{
					System.out.println("Price for Pepsi for this customer is 2.00 euro");
				}
				else if(choice==('c')&& guest==('y'))
				{
					System.out.println("Price for Coke for this customer is 1.50 euro");
				}
				else if(choice==('c')&& guest==('n'))
				{
					System.out.println("Price for Coke for this customer is 2.25 euro");
				}
				else if(choice==('n'))
				{
					System.out.println("Thanks for shopping with us!");
				}
				System.out.print("Enter Y to return to main menu or N to quit: ");
				loop= keyboard.next().charAt(0);

			}


		}

	}
}