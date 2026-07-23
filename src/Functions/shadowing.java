package functions;

public class shadowing {
    static int x=30;
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
    
}
