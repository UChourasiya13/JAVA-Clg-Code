import java.util.Scanner;

public class FactRecursion {
    public static long multiplynum(int n){
        if(n>= 1){
            return n*multiplynum(n-1);
        }
        else
            return 1 ;
    }
    public static void main(String[] args) {
        System.out.print("Enter number to find its factorial :");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        long fact = multiplynum(n);
        System.out.println("factorial of " + n + " is : " +fact);
    }
}
