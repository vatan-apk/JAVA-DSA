
public class ClearIthbit{
    public static void main(String[] args) {
        System.out.println(fun(10,1));
    }
    public static int fun(int n, int i){
    int bitMask = ~(1<<i);
    return n & bitMask;

    }
}
