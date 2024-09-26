import java.util.*;
class Fibonacci{
	public static void main(String [] args){
		int a=0, b=1;
		
		System.out.print("Enter the value of N:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("First "+n+" Fibonacci numbers are:");
		System.out.println(a);
		System.out.println(b);
		
		for(int i=2;i<n;i++){
			int c=a+b;
			System.out.println(c);
			a=b;
			b=c;
		}
	}
}