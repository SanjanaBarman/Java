import java.util.*;
class VowelInSentence{
	public static void main(String[] args){
		System.out.print("Enter a sentence:");
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		int f=0;
		for(int i=0;i<s.length();i++){
			char ch=s.charAt(i);
			if((ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')||(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'))
				f++;
		}
		System.out.println("Total vowel present in '"+s+"' is:"+f);
	}
}