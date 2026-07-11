import java.util.*;

public class ClearRangeofBits{
    public static void main(String[] args) {
    System.out.println(fun(15,2,4));
    }
    public static int fun(int i,int j, int n){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitMask = a | b;
        return n & bitMask;
    }
}