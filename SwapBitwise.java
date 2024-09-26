import java.io.*;
class SwapBitwise
{
	public static void main(String[] args)
	{
		Console co=System.console();
		System.out.print("Enter two numbers:");
		int a=Integer.parseInt(co.readLine());
		int b=Integer.parseInt(co.readLine());
		System.out.print("Before swapping:-");
		System.out.println("a = "+a+",b= "+b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.print("After swapping:-");
		System.out.println("a = "+a+",b= "+b);
	}
}