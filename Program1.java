
//1.	Write a program that produces the following output:
//        Hello World!
//        It's been nice knowing you.
//        Goodbye world!

public class Program1 {
    String msg = "Hello World!\n" +
            "Its been nice knowning you\n" +
            "Goodbye World";

    public void printmsg(){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        Program1 p1 = new Program1() ;
        p1.printmsg();
    }
}
