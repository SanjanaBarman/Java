//Overload the constructor for class Box for cube and cone and also display its volume
class Box
{
	static double vol;
	Box(double side)
	{
		vol=side*side*side;
	}
	Box(double r,double h)
	{
		vol=(3.14*r*r*h)/3;
	}
	void display()
	{
		System.out.println(Box.vol);
	}
}

class As3_2
{
	public static void main(String [] args)
	{
		Box s=new Box(2.0);
		System.out.print("The volume of Cube is :");
		s.display();
		
		Box c=new Box(2.0,4.0);
		System.out.print("The volume of Cone is :");
		c.display();
	}
}