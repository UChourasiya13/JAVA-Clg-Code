public class Hello {
    String msg = "Hello, Welcome To JAVA Programming" ; // initializing data member
    public void print_msg(){ //creating member function
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Hello h = new Hello(); //creating object
        h.print_msg() ; //Calling member function
    }
}
