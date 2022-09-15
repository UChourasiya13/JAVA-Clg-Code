import java.util.Scanner;

public class OddEven {
    public void CallOddEven(int num){
        if(num%2==0) System.out.println("Even");
        else System.out.println("Odd");
    }
    public static void main(String[] args) {
        System.out.println("Enter any integer to check it is odd or even");
        Scanner in = new Scanner(System.in) ;
        int n = in.nextInt();
        OddEven a = new OddEven() ;
        a.CallOddEven(n);
    }


}
