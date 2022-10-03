import java.util.Scanner;
//4.	Write  an  application  that  declares  5  integers,  calculates  and  print  the  average  of  these
//        numbers.

public class Program4 {
    public void print_sum_avg(int n1,int n2,int n3,int n4,int n5){
        int sum = n1+n2+n3+n4+n5;
        int avg = sum/5 ;
        System.out.println("sum of 5 number is : " + sum + " "+ "and avg is : " + avg);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 5 number :");
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        int x3 = in.nextInt();
        int x4 = in.nextInt();
        int x5 = in.nextInt();
        Program4 p4 = new Program4();
        p4.print_sum_avg(x1,x2,x3,x4,x5);

    }
}
