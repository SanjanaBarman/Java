import java.util.*;
class Circle_area
{
	public static void main(String [] args)
	{
		System.out.print("Enter the radius of the circle:");
		Scanner sc=new Scanner(System.in);
		int r=sc.nextInt();
		double area= 3.14 * r*r;
		System.out.println("The area of the circle is : " + area);
	}
}