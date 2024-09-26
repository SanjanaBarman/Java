import java.util.*;
class BinarySearch{
	static int arr[]=new int[100];
	void selectionSort(int n){
		for(int i=0;i<n-1;i++){
			int min=i;
			for(int j=i+1;j<n;j++){
				if(arr[j]<arr[min]){
					min=j;
				}
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println("Sorted array:");
        for (int k = 0; k < n; k++) {
            System.out.print(arr[k] + " ");
        }
        System.out.println();
	}
	
	int binarySearch(int n,int x){
		int low=0;
		int high=n-1;
		
		while(low<=high){
			int mid=(low+high)/2;
			if(x == arr[mid])
				return mid;
			else if(x>arr[mid])
				low=mid+1;	
			else
				high=mid-1;
		}
		return -1;
	}
	
	public static void main(String [] args){
		System.out.print("Enter the number of elements you want to enter:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println("Enter "+n+" unsorted array of integers:");
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		BinarySearch ob=new BinarySearch();
		ob.selectionSort(n);
		
		System.out.print("Enter the number you want to search:");
		int x=sc.nextInt();
		
		int result=ob.binarySearch(n,x);
		
		if(result != -1)
			System.out.println(x +" Found at index "+result);
		else
			System.out.println(x+" is NOT present in the array");
	}
}