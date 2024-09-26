class A{
	int x,y;
	A()
	{
		x=5;
		y=9;
	}
}

class B{
	public static void main(String [] agrs){
		A ob=new A();
		System.out.println(ob.x);
	}
}