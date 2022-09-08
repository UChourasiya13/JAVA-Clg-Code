import java.util.Scanner;

public class Calculator {

    public void add(int n1 , int n2 ){
        int result = n1 + n2 ;
        System.out.println("sum is :"+ result);
    }
    public void Mul(int n1 , int n2 ){
        int result = n1 * n2 ;
        System.out.println("Multiplication is :"+ result);
    }
    public void Div(int n1 , int n2 ){
        int result = n1 / n2 ;
        System.out.println("Division is :"+ result);
    }
    public void Sub(int n1 , int n2 ){
        int result = n1 - n2 ;
        System.out.println("Subtraction is :"+ result);
    }
    public void Mod(int n1 , int n2 ){
        int result = n1 % n2 ;
        System.out.println("Modulus is :"+ result);
    }

    public static void main(String[] args) {
        System.out.println("Enter ! to end  calculation");
        Calculator C1 = new Calculator();
        Scanner in = new Scanner(System.in);
        char operator;
        System.out.println("Enter Numbers");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        while (true) {
            System.out.println("Choose an operator: +, -, *, /,%");
            operator = in.next().charAt(0);
            switch (operator) {
                case '+':
                    C1.add(n1, n2);
                    break;
                case '*':
                    C1.Mul(n1, n2);
                    break;
                case '/':
                    C1.Div(n1, n2);
                    break;
                case '-':
                    C1.Sub(n1, n2);
                    break;
                case '%':
                    C1.Mod(n1, n2);
                    break;

                default:
                    System.out.println("Invalid Operator");
                    break;


            }
            if(operator == '!'){
                System.out.println("Calculation completed");
                return;
            }
        }


    }
}
