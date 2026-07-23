package bit_manipulation;


import java.util.ArrayList;

public class Decimal_to_binary{
    public static void main(String[] args) {
        int a = 9;
        System.out.println(fun(a));
    }
    public static String fun(int a ){
        int rem =0;
ArrayList<Integer> list = new ArrayList<>();
        while(a>0) { 
            rem = a%2;
        list.add(rem);
            a/=2;
        }
        StringBuilder sb = new StringBuilder();
        for(int i=list.size()-1;i>=0;i--){
        sb.append(list.get(i));

        }
        return sb.toString();
        
    }
}