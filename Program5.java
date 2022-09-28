//5.	Write an application that declares two integers, determines whether the first is a multiple of
//        the second and print the result. [ Hint : Use the remainder operator.]

import java.util.Scanner;

public class Program5 {
    public void printmultiply(int n1 , int n2){
        if(n2%n1==0) System.out.println("n1 is multiple of n2");
        else System.out.println("n1 is not a multiple of n2");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int x1 = in.nextInt();
        System.out.println("N1 = " + x1);
        int x2 = in.nextInt();
        System.out.println("N2 = " + x2);
        Program5 p5 = new Program5() ;
        p5.printmultiply(x1 , x2);

    }
}
