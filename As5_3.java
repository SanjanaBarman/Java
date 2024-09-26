interface One{
	void show();
	void showAgain();
}

interface Two{
	void display();
	void displayAgain();
}

interface Three extends One,Two{
	void print();
}

class A{
	void a(){
		System.out.println("Inside Concrete method");
	}
}

class B extends A implements Three{
	public void show(){
		System.out.println("Show Inside Interface ONE");
	}
	public void showAgain(){
		System.out.println("ShowAgain Inside Interface ONE");
	}
	public void display(){
		System.out.println("Display Inside Interface TWO");
	}
	public void displayAgain(){
		System.out.println("DisplayAgain Inside Interface TWO");
	}
	public void print(){
		System.out.println("Print Inside Interface THREE");
	}
}

class As5_3{
	public static void main(String [] args){
		B ob=new B();
		ob.show();
		ob.showAgain();
		ob.display();
		ob.displayAgain();
		ob.print();
		ob.a();
	}
}