//2.	State the order of evaluation of the operations in each of the following Java statements and
//        implement them to show the value of x after each statement.
//        (1) x = 7 + 3 * 6 / 2 – 1;
//        (2) x = 2 % 2 + 2 * 2 – 2 / 2;
//        (3) x = ( 3 * 9 * ( 3 + ( 9 * 3 / (3)
//        ) ) );

public class Program2 {
    public static void main(String[] args) {
        int x , x1 , x2;
        x = 7 + 3 * 6 / 2 -1; // order of evalution is( * / + - )
        x1 = 2 % 2 + 2 * 2-2 / 2; // * % / + -
        x2 = ( 3 * 9 * ( 3 + ( 9 * 3 / (3)) ) ) ;
        System.out.println(x);
        System.out.println(x1);
        System.out.println(x2);
    }
}
