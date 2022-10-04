public class JavaVariables6
{
	public static void main(String[] args)
	{
		byte bytemin= -128;
		byte bytemax= 127;
		short shortmin= -32768;
		short shortmax= 32767;
		int minint= Integer.MAX_VALUE;
		int maxint= Integer.MIN_VALUE;
		long minlong= -9223372036854775808l;
		long maxlong= 9223372036854775807l;

		System.out.println("Min Byte value is: "+bytemin);
		System.out.println("Max Byte value is: "+bytemax);
		System.out.println("Min Short value is: "+shortmin);
		System.out.println("Max Short value is: "+shortmax);
		System.out.println("Min Int value is: "+minint);
		System.out.println("Max Int value is: "+maxint);
		System.out.println("Min Long value is: "+minlong);
		System.out.println("Max Long value is: "+maxlong);
	}
}