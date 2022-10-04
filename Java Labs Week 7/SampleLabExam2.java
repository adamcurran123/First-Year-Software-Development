//Adam Curran G00407852
//9-11-2021
import java.util.Scanner;
public class SampleLabExam2
{
	public static void main(String[] args)
	{
// Declare Keyboard as the input device
		Scanner keyboard = new Scanner(System.in);
//Declare variables
		int userinput;
		double mile;
		double km;
		int cel;
		int faren;
		double inch;
		double mm;
		double euro;
		double sterl;

//Print out menu into console
		System.out.println("\t\t-------------------------------------");
		System.out.println("\t\t\tJAVA MULTI-CONVERTER");
		System.out.println("\t\t-------------------------------------");
		System.out.println("\t************************** MENU *************************");
		System.out.println("\t*                                                       *");
		System.out.println("\t*        Choose from one of the following options:      *");
		System.out.println("\t*                                                       *");
		System.out.println("\t*   1. Convert Distance:      Miles to Kilometers       *");
		System.out.println("\t*   2. Convert Distance:      Kilometers to Miles       *");
		System.out.println("\t*   3. Convert Temperature:   Celsius to Farenheit      *");
		System.out.println("\t*   4. Convert Temperature:   Farenheit to Celsius      *");
		System.out.println("\t*   5. Convert Length:        Inches to Millimeters     *");
		System.out.println("\t*   6. Convert Length:        Millimeters to Inches     *");
		System.out.println("\t*   7. Convert Finance:       Euros to Sterling         *");
	    System.out.println("\t*   8. Convert Finance:       Sterling to Euros         *");
		System.out.println("\t*                                                       *");
		System.out.println("\t*********************************************************");

//Declare calculation variables

		//double km2 = km/1.609;
		//int cel2 = (cel*9/5)+32;
	    //int faren2 = (faren-32)*5/9;
		//double inch2 = inch*25.4;
		//double mm2 = mm/25.4;
		//short euro2 = euro*0.85
		//short sterl2 = euro/0.85

//Allow user to input their choice
		System.out.print("Enter option(1 to 8): ");
		userinput = keyboard.nextInt();

		if(userinput==1)
		{
			System.out.println("\t1. Convert Miles to Kilometers");
			System.out.print("\tEnter Miles: ");
			mile = keyboard.nextDouble();
			double mile2 = mile*1.609;
			System.out.println(mile+" miles is "+mile2+" km");
		}

		else if(userinput==2)
		{
			System.out.println("\t1. Convert Kilometers to Miles");
			System.out.print("\tEnter Kilometers: ");
			km = keyboard.nextDouble();
			double km2 = km/1.609;
			System.out.println(km+" Kilometers is "+km2+" miles");
		}
		else if(userinput==3)
		{
			System.out.println("\t1. Convert Celsius to Farenheit");
		    System.out.print("\tEnter Celsius: ");
			cel = keyboard.nextInt();
			int cel2 = (cel*9/5)+32;
			System.out.println(cel+" celsius is "+cel2+" farenheit");
		}
		else if(userinput==4)
		{
			System.out.println("\t1. Convert Farenheit to Celsius");
			System.out.print("\tEnter Farenheit: ");
			faren = keyboard.nextInt();
			int faren2 = (faren-32)*5/9;
			System.out.println(faren+" farenheit is "+faren2+" celsius");
		}
		else if(userinput==5)
		{
			System.out.println("\t1. Convert Inches to Millimeters");
			System.out.print("\tEnter Inches: ");
			inch = keyboard.nextDouble();
			double inch2 = inch*25.4;
			System.out.printf("%f inches is %f mm ",inch, inch2);
		}
		else if(userinput==6)
		{
			System.out.println("\t1. Convert Millimeters to Inches");
			System.out.print("\tEnter Millimeters: ");
			mm = keyboard.nextDouble();
			double mm2 = mm/25.4;
			System.out.printf("%f millimeters is %f inches ",mm, mm2);
		}
		else if(userinput==7)
		{
			System.out.println("\t1. Convert Euro to Sterling");
			System.out.print("\tEnter Euro: ");
			euro = keyboard.nextDouble();
			double euro2 = euro*0.85;
			System.out.printf("%f euro is %f sterling ",euro, euro2);
		}





	}
}