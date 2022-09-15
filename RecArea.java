import java.util.Scanner;


public class RecArea {
    public void area(int l , int b ){
        int areaofrec  = l*b ;
        System.out.println("Area of rectange is :" + areaofrec);
    }
    public static void main(String[] args) {
        System.out.print("Enter length and breath of rectangle :");
        Scanner in = new Scanner(System.in);
        int length = in.nextInt();
        int breadth = in.nextInt();
        RecArea a = new RecArea();
        a.area(length , breadth);

    }
}
