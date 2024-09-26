/*Create a class EMP having instance variable name and id. 
Create its subclass (say Scientist) which has instance variable no_of_publication and experience.
Now create its subclass, say Dscientist which has instance variable award.
Put a method: public String toString() {  }  in every class where you describe about the class and
from main create object of each class and printeach object */

class Emp {
	String name; int id;
	Emp (String s, int i) {
		name =s;
		id=i;
	}
	public String toString()
	{
		return "Name="+name+" ,Id="+id;
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
	public String toString()
	{
		return super.toString()+", No. of publication="+no_of_pub+ ", Experience (years)="+exp;
	}
}

class Dsci extends Sci{
	String award;
	Dsci(String x,int i,int p,int f,String a)
	{
		super(x,i,p,f);
		award=a;
	}
	public String toString()
	{
		return super.toString()+", Award="+award;
	}
}

class As3_4{
	public static void main(String[] args){
		System.out.println(new Emp ("Ram",01));
		System.out.println(new Sci("Shyam",02,100,5));
		System.out.println(new Dsci("Jadhu",03,200,10,"Padma"));
	}
}