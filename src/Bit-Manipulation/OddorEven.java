package bit_manipulation;


public class OddorEven{
    public static void main(String[] args) {
    fun(3);
    fun(4);
    fun(5);
    }
    public static void fun(int n){
        int bitMask=1;
        if((n & bitMask)==0){
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}