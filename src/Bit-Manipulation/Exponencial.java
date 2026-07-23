package bit_manipulation;


public class Exponencial{
    public static void main(String[] args) {
        System.out.println(fun(5,3));
    }
    public static int fun(int a,int b){
        int ans = 1;
        while (b>0) { 
            if((b & 1)!=0){
                ans *=a; 
            }
            a=a*a;
            b=b>>1;
        }
        return ans;
    }
}