package bit_manipulation;

import java.util.*;

public class setIthbit{
    public static void main(String[] args) {
        System.out.println(fun(10,2));
    }
    public static int fun(int n, int i){
        int bitMask=1<<i;
            return   n | bitMask;
    }
}