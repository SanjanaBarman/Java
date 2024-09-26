import java.util.*;

class Series{
	public static void main(String [] args){
		System.out.print("Enter the value of n (1^2 + 2^2 + 3^2 + ...... +n^2):");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++){
			sum=sum+(i*i);
		}
		System.out.println ("1^2 + 2^2 + 3^2 + ...... +"+ n+ "^2 =" +sum);
	}
}