/* Create a class which contains a Inner class.
Show that the Inner class can use member of Outer class directly, but Outer class can use member of Inner class only through its object.
Check the name of class file , you created */

class Outer{
	int[] num;
	Outer(int[] n){
		num=n;
	}
	void analyze(){
		Inner in=new Inner();
		System.out.println("Maximum is:"+ in.max());
		System.out.println("Minimum is:"+ in.min());
		System.out.println("Average is:"+ in.avg());
	}
	class Inner{
		
		int max(){
			int max=num[0];
			for(int i=1;i<num.length;i++){
				if(num[i]>max){
					max=num[i];
				}
			}
			return max;
		}
		
		int min(){
			int min=num[0];
			for(int i=1;i<num.length;i++){
				if(num[i]<min){
					min=num[i];
				}
			}
			return min;
		}
		
		int avg(){
			int a=0;
			for(int i:num){
				a=a+i;
			}
			return a/num.length;
		}
	} //Inner
}  //Outer


class As5_2{
	public static void main(String [] args){
		int x[]={2,4,12,8,2};
		Outer ob=new Outer(x);
		ob.analyze();
	}
}