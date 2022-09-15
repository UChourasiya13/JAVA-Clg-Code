import java.util.Scanner;

public class CirclePerimeter {
    public void perimeter(int r){
        float peri = (float)(2*3.14*r) ;
        System.out.println("Perimeter of circle is :" + peri);

    }
    public static void main(String[] args) {
        CirclePerimeter C = new CirclePerimeter();
        System.out.print("Enter radius of cicle :");
        Scanner in = new Scanner(System.in) ;
        int i = in.nextInt() ;
        C.perimeter(i) ;

    }
}
