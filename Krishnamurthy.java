import java.util.*;
class Krishnamurthy{
    public static int factorial(int n){
        int fact=1;
        while(n > 0){
            fact=fact*n;
            n=n-1;
        }
        return fact;
    }
    public static void is_Krish(int n){
        int num=n;
        int sum=0;
        while(num>0)
        {
            int digit=num%10;
            num=num/10;
            sum=sum+( factorial(digit));
        }
        if(sum == n)
            System.out.println(n +" is a Krishnamurthy number");
        else
            System.out.println(n +" is a NOT Krishnamurthy number");
    }
    
    public static void main(String [] args){
        System.out.print("Enter a number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        is_Krish(n);
    }
}