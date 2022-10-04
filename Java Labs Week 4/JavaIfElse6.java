import java.util.Scanner;
public class JavaIfElse6
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int firstNum;
		int secondNum;
		char operator;

		System.out.print("Enter first number: ");
		firstNum = keyboard.nextInt();

		System.out.print("Enter second number: ");
		secondNum = keyboard.nextInt();

		System.out.print("Enter operator: a, s, d, m): ");
		operator = keyboard.next().charAt(0);

		int add= firstNum+secondNum;
		int sub= firstNum-secondNum;
		int div= firstNum/secondNum;
		int mul= firstNum*secondNum;

		if(operator == 'a')
		{
			System.out.println(firstNum+" plus "+secondNum+" is: "+add);
		}
		if(operator == 's')
		{
			System.out.println(firstNum+" minus "+secondNum+" is: "+sub);
		}
		if(operator == 'd')
		{
			System.out.println(firstNum+" divide "+secondNum+" is: "+div);
		}
		if(operator == 'm')
		{
			System.out.println(firstNum+" multiplied by "+secondNum+" is: "+add);
		}
	}
}


