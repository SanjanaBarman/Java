/*class MyClass
{
	int a;
	boolean myMethod(MyClass ob)
	{
		if(a==ob.a)
			return true;
		else
			return false;
	}
}

class PassSameClassObj
{
	public static void main(String [] args)
	{
		MyClass ob1,ob2,ob3;
		ob1 = new MyClass(5);
		ob2 = new MyClass(5);
		ob3 = new MyClass(50);
		System.out.println("Equality of ob1 & ob2"+ ob1.myMethod(ob2));
		System.out.println("Equality of ob1 & ob3"+ ob1.myMethod(ob3));
	}
}*/
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class MyClass
{
	int a;
	MyClass(int x)
	{
	    a = x;
	}
	boolean myMethod(MyClass b)
	{
		if(a==b.a)
			return true;
		else
			return false;
	}
}

class PassSameClassObj
{
	public static void main(String [] args)
	{
		//MyClass ob1,ob2,ob3;
		MyClass ob1 = new MyClass(5);
		MyClass ob2 = new MyClass(5);
		MyClass ob3 = new MyClass(50);
		System.out.println("Equality of ob1 & ob2 " + ob1.myMethod(ob2));
		System.out.println("Equality of ob1 & ob3 "+ ob1.myMethod(ob3));
	}
}