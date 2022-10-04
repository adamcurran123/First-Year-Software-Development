
//Adam Curran G00407852

import java.util.Scanner;
public class AdamCurranSampleLabExam1
{
	public static void main(String[] args)
	{

	Scanner keyboard = new Scanner(System.in);

	//Declare Variables
	String password;
	double firstnum;
	double secondnum;
	char operator;
	char perform;

	//Prompt user to enter in password which is checked to see if it is correct
	System.out.println("CONSOLE CALCULATOR");

	System.out.print("Input password to enter: ");
	password = keyboard.nextLine();

		if(!password.equalsIgnoreCase("pass"))
		{
			System.out.println("Invalid password entered");
		}
		else
		{
			System.out.println("-------------WELCOME TO CALCULATOR-------------");
			System.out.println("Enter two numbers for calculation");
			System.out.println("-----------------------------------------------");
	//Allow user to input their numbers into calculator
			System.out.print("Enter first number: ");
			firstnum = keyboard.nextDouble();
			System.out.print("Enter second number: ");
			secondnum = keyboard.nextDouble();

	//Ask user what calculation they want to perform

			System.out.println("What calculation do you wish to perform?");

			System.out.print("Enter A for add, S for subtract, M for mulitply, D for divide, R for remainder: ");
			operator = keyboard.next().charAt(0);

	//Declare new valuables for each of the operators
			double add = firstnum+secondnum;
			double sub = firstnum-secondnum;
			double mul = firstnum*secondnum;
			double div = firstnum/secondnum;
			double mod = firstnum%secondnum;

	//Perform the calculations using if statements and output the new operator variables

			if(operator==('a'))
			{
				System.out.println("\n\t "+firstnum+" plus "+secondnum+" is:  "+add);
	 		}

			else if(operator==('s'))
			{
				System.out.println("\n\t "+firstnum+" minus "+secondnum+" is: "+sub);
	 		}

			else if(operator==('m'))
			{
				System.out.println("\n\t "+firstnum+" multiplied by "+secondnum+" is: "+mul);
	 		}

			else if(operator==('d'))
			{
				System.out.println("\n\t "+firstnum+" divided by "+secondnum+" is: "+div);
	 		}

			else if(operator==('r'))
			{
				System.out.println("\n\t "+firstnum+" mod "+secondnum+" is: "+mod);
			}

			System.out.println("\n Enter Y to perform another calculation: ");
			perform = keyboard.next().charAt(0);

		//Ask the user do they want to perform another calculation

			while(perform == 'y')
			{

					System.out.println("-----------------------------------------------");
					System.out.print("Enter first number: ");
					firstnum = keyboard.nextDouble();
					System.out.print("Enter second number: ");
					secondnum = keyboard.nextDouble();

		//Ask user what calculation they want to perform

					System.out.println("What calculation do you wish to perform?");

					System.out.print("Enter A for add, S for subtract, M for mulitply, D for divide, R for remainder: ");
					operator = keyboard.next().charAt(0);

		//Perform the calculations using if statements and output the new operator variables

					if(operator==('a'))
					{
						System.out.println("\n\t "+firstnum+" plus "+secondnum+" is:  "+add);
					}

					else if(operator==('s'))
					{
						System.out.println("\n\t "+firstnum+" minus "+secondnum+" is: "+sub);
					}

					else if(operator==('m'))
					{
						System.out.println("\n\t "+firstnum+" multiplied by "+secondnum+" is: "+mul);
					}

					else if(operator==('d'))
					{
						System.out.println("\n\t "+firstnum+" divided by "+secondnum+" is: "+div);
					}

					else if(operator==('r'))
					{
						System.out.println("\n\t "+firstnum+" mod "+secondnum+" is: "+mod);
					}

					System.out.println("\n Enter Y to perform another calculation: ");
					perform = keyboard.next().charAt(0);

			}
		}
		//Add in end of programme message for when user choosese to end programme

				System.out.println("----------------------------");
				System.out.println("| END OF PROGRAMME REACHED |");
				System.out.println("----------------------------");
	}
}