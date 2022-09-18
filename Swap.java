import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 number for swapping :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before Swapping");
        System.out.println("A: " + a + " " + "B: " + b);
        swapper(a,b);
    }
    public  static void swapper(int n1 , int n2){
        int temp = n1 ;
        n1 = n2 ;
        n2 = temp ;
        System.out.println("After Swapping");
        System.out.println("A: " + n1 + " " + "B: " + n2);
    }
}
