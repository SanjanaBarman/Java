import java.util.Scanner;
class String2c{
	int count(String str, char ch)
	{
		int f=0;
		for (int i=0;i<str.length();i++){
			if(str.charAt(i) == ch){
				f=f+1;
			}
		}
		return f;
	}
}

class CharAtString{
	public static void main(String [] args){
		
		System.out.print("Enter a string:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	
		System.out.print("Enter a char you want to serach:");
		char ch=sc.next().charAt(0);
		
		String2c ob=new String2c();
		int x=ob.count(str,ch);
		
		System.out.println(ch +" is present in "+ str+" is "+x+" times");
	}
}