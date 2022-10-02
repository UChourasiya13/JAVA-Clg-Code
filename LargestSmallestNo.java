//3.	Write an application that declares 5 integers, determines and prints the largest and smallest in
//        the group.

import java.util.Scanner;


public class Program3 {
    public void printlargest(int n1,int n2,int n3,int n4,int n5){
        int large = n1 ;
        if (n2>large) large = n2;
        if (n3>large) large = n3;
        if (n4>large) large = n4;
        if (n5>large) large = n5;
        System.out.println("Largest number is :" + large);
    }
    public void printsmallest(int n1,int n2,int n3,int n4,int n5){
        int small = n1 ;
        if (n2<small) small = n2;
        if (n3<small) small = n3;
        if (n4<small) small = n4;
        if (n5<small) small = n5;
        System.out.println("Largest number is :" + small);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in) ;
        System.out.print("Enter 5 number :");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int x4 = in.nextInt();
        int x5 = in.nextInt();
        Program3 p3 = new Program3();
        p3.printlargest(x1,x2,x3,x4,x5);
        p3.printsmallest(x1,x2,x3,x4,x5);
    }


}
