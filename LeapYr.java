import java.io.*;
class LeapYr
{
	public static void main(String[] args)
	{
		Console co=System.console();
		System.out.print("Enter a year:");
		int yr=Integer.parseInt(co.readLine());
		if((yr%4==0)&&((yr%400==0)||(yr%100!=0)))
			System.out.print(yr + " is a Leap Year");
		else
			System.out.print(yr + " is NOT a Leap Year");
	}
}