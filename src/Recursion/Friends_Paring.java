package recursion;

public class Friends_Paring{
    public static void main(String[] args) {
        System.err.print(fun(3));

    }
    public static int fun(int n){
        if(n==1 || n==2){
            return n;
        }
        int fnm1=fun(n-1);
        int fnm2=fun(n-2);
        int pairsWays = fnm2*(n-1);
        int sum = fnm1+pairsWays;
        return sum;

    }
}