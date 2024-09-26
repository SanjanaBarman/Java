import java.util.*;

class Palindrome{
	public static void main(String[] args){
		
		System.out.print("Enter a number:");
		Scanner sc=new Scanner (System.in);
		int n=sc.nextInt();
	
		if(n<0)
			System.out.println(n +" is a Negative number");
		else if(n==0)
			System.out.println(n + " is a Zero");
		else
		{
			int fn=n;
			int rev=0;
			while (n >0)
			{	
				int rem=n%10;
				rev=(rev*10)+rem;
				n=n/10;
			}
			if(rev==fn)
				System.out.println(fn + " is a Palindrome number");
			else
				System.out.println(fn + " is NOT a Palindrome number");
		}
	}
}