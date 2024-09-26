import java.util.*;
class WordCount{
	public static void main(String [] args){
		System.out.print("Enter a sentence:");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
	
		int f=1;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' ')
				f=f+1;
		}
		System.out.println("The number of word present in the sentence ' "+str+ " ' is:"+f);
	}
}