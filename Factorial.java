public class Factorial {

    // Method to calculate factorial using recursion
    public static long factorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            return n * factorial(n - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
      int n = Integer.parseInt(args[0]);
      Factorial f = new Factorial(n);
      System.out.println("Factorial = "+f.factorial()); 
    }
}
