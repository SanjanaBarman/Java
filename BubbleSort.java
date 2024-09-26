import java.util.*;
class BubbleSort{
	public static void main(String [] args){
		System.out.print("Enter the number of element:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.print("Enter "+ n+ " numbers:");
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
		}
		
		System.out.println("The sorted array:");
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1-i;j++){
				if(a[j]>a[j+1]){
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int i=0;i<n;i++)
			System.out.print(a[i] + " ");
		
		System.out.print("\nThe second largest number is:"+ a[n-2]);
	}
}