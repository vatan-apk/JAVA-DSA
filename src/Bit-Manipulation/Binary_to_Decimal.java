package bit_manipulation;

import java.util.*;
public class Binary_to_Decimal{
public static void main(String[] args) {
    int a = 1001;
    System.out.println(fun(a));
}
public static int fun(int a){
    int count=0;
    int ans =0;
while(a>0) { 
    int lastDigit= a%10;
     ans += lastDigit*Math.pow(2,count);
    count++;
     a/=10; 
}
return ans;
}
}