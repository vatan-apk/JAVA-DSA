package recursion;

public class Binary_String{
    public static void main(String[] args) {
        fun("",3,0);
    }
    public static void fun(String str,int n , int lastPlace){
        if(n==0){
            System.out.println(str);
            return ;
        }
        fun(str+"0",n-1,0);
        if(lastPlace==0){
            fun(str+"1",n-1,1);

        }
    }
}