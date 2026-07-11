public class shadowing {
    static int x=30;
    public static void main(StringArray[] args) {
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
    
}
