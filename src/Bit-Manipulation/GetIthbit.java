package bit_manipulation;

import java.util.*;

public class GetIthbit{
    public static void main(String[] args) {
        System.out.println(fun(10, 2));
    }
    public static int fun(int n,int i){
        int bitmask=1<<i;
        if((n&bitmask)==0){
            return 0;
        }else{
            return 1;
        }
    }
}