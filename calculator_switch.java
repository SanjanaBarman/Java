import java.util.*;
class calculator_switch{
	public static void main(String [] args){
		System.out.print("Enter two numbers:");
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter the operation you want to perform (1/2/3/4/5):");
		int ch=sc.nextInt();
		
		switch(ch){
			case 1: System.out.println("The Addition of a and b is :" + (a+b));
			break;
			case 2:System.out.println("The Substraction of a and b is :"+(a-b));
			break;
			case 3: System.out.println("The Multiplication of a and b is :"+(a*b));
			break;
			case 4:System.out.println("The Division of a and b is :"+(a/b));
			break;
			case 5: System.out.println("The Remainder of a and b is :"+(a%b));
			break;
			default:System.out.println("Invalid choice. Enter 1/2/3/4/5");
		}
	}
}