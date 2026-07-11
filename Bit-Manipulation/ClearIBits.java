
public class ClearIBits{
    public static void main(String[] args) {
        System.err.println(clearI(15,2));
    }
    public static int clearI(int n, int i){
        int bitmask=(~0)<<i;
        return n & bitmask;
    }
}