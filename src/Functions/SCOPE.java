package functions;

public class SCOPE {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        String name = " vatan ";
        {
            a=100;
            System.out.println(a);
            int c=99;
            name="rahul";
        }
        System.out.println(a);
        System.out.println(name);
    }
    static void random(int marks){
        int num= 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
