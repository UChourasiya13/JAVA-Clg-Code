import java.util.Scanner;

public class SwapWithoutThird {
    public static void main(String[] args) {
        System.out.print("Enter number for Swapping: ");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Before Swapping");
        System.out.println("Num1 =" + a + "  And  " + "Num2 =" + b);
        swap(a,b);
    }
    public static void swap( int x ,int y){
        x = x^y;
        y = x^y;
        x = x^y;
        System.out.println("---------------------------------------");
        System.out.println("After Swapping");
        System.out.println("Num1 =" + x + "  And  " + "Num2 =" + y);

    }
}
