public class Student {
    int id ;
    static String name;
//    public String name;
//    public method and static can only access by other class

}

    class Info {
        public static void main(String[] args) {
        Student s1 = new Student() ;
        s1.name = "ujjawal";
        s1.id = 1 ;
            System.out.println("Name is "+s1.name + " Id is " + s1.id);

        }
    }

