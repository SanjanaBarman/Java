class A
{
	int x;
	A(int k)
	{
		x = k;
	}
}

class MyClass{
	int a;
	MyClass(int b)
	{
		a = b;
	}
	boolean myMethod(A ob)
	{
		if(a==ob.x)
			return true;
		else
			return false;
	}
}

class PassDifferentClassObj
{
	public static void main(String [] args)
	{
		MyClass ob1;
		A ob2 = new A(5);
		A ob3 = new A(8);
	
		ob1 = new MyClass(5);
		System.out.println("Equality of ob1 & ob2 "+ ob1.myMethod(ob2));
		System.out.println("Equality of ob1 & ob3 "+ ob1.myMethod(ob3));
	}
}