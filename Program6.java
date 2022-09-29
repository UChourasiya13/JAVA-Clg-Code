//6.	Write an application that calculates the product of the odd integers from 1 to 15.
class product {
    int n1,n2,prod=1;

    public void setdata(int n1,int n2){
        this.n1 = n1 ;
        this.n2 = n2 ;

    }
    public int prod(){
        while(n1<=n2){
            if ((n1%2) != 0){
                prod =  prod*n1 ;
            }
            n1++ ;
        }
        return prod;
    }
 }
public class Program6 {
    public static void main(String[] args) {
        product p = new product() ;
        p.setdata(1,15);
        int p1 = p.prod() ;
        System.out.println(p1);
    }
}
