import java.util.*;
class Triplet{
	int a,b,c;
	void getdata(){
		System.out.print("Enter 3 numbers to check Pythagorean Triples:");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
	}
	void findprint(){
		if(((a*a)+(b*b))==(c*c))
			System.out.println(a +" , "+ b +" and "+ c +" are Pythagorean Triplet");
		else
			System.out.println( a+" , "+ b +" and "+c+" are NOT Pythagorean Triplet");
	}
}

class PythagoreanTriplet{
	public static void main(String [] args){
		Triplet ob=new Triplet();
		ob.getdata();
		ob.findprint();
	}
} 