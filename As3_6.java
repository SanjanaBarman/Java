/*Create a class EMP having instance variable name and id. 
Create its subclass (say Scientist) which has instance variable no_of_publication and experience.
Now create its subclass, say Dscientist which has instance variable award.
Put a method: display() {  }  in every class where you describe about the class and
from main create object of each class and printeach object
Use DYNAMIC METHOD DISPATCHING */

class Emp {
	String name; int id;
	Emp (String s, int i) {
		name =s;
		id=i;
	}
	void display()
	{
		System.out.println("Name="+name+" ,Id="+id);
	}
}

class Sci extends Emp{
	int no_of_pub, exp;
	Sci(String n,int id,int p,int e)
	{
		super(n,id);
		no_of_pub=p;
		exp=e;
	}
	void display()
	{
		System.out.println("Name="+name+" ,Id="+id+", No. of publication="+no_of_pub+", Experience(years)="+exp);
	}
}

class Dsci extends Sci{
	String award;
	Dsci(String x,int i,int p,int f,String a)
	{
		super(x,i,p,f);
		award=a;
	}
	void display()
	{
		System.out.println("Name="
		+name+ " ,Id=" +id+ ", No. of publication=" +no_of_pub+", Experience(years)="+exp+", Award=" +award);
	}
}

class As3_6{
	public static void main(String[] args){
		Emp ob;
		ob=new Emp ("Laxmi",01);
		ob.display();
		
		ob=new Sci("Saraswati",02,100,5);
		ob.display();
		
		ob=new Dsci("Durga",03,200,10,"Padma");
		ob.display();
	}
}