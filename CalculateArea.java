import java.util.Scanner;

public class CalculateArea {

    public void Circle(int r){
        float area = (float)3.14*r*r ;
        System.out.println("Area of circle is :" + area);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int rad = in.nextInt();
        CalculateArea a = new CalculateArea();
        a.Circle(rad);
    }
}
