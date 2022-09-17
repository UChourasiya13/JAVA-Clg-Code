import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        ReverseNum obj = new ReverseNum();
        long num = obj.setnum();
        obj.revese(num);
    }
    public long setnum(){
        Scanner in = new Scanner(System.in);
        long num = in.nextLong();
        return num ;
    }
    public void revese( long n){
        long rem , rev=0;
        while (n>0){
            rem = n%10;
            rev = rev*10 + rem ;
            n= n/10;
        }
        System.out.println("reverse number is :" + rev);

    }
}
