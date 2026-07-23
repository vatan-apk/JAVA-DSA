package recursion;

public class Febonacci{
    public static void main(String[] args) {
        int ans = febo(6);
        System.out.println(ans);
    }
    public static int  febo(int n){
    if(n==0 || n==1){
        return n;
    } 
    int fnm1 = febo(n-1);
    int fnm2 = febo(n-2);
    int fn = fnm1 + fnm2;
    return fn;
    }
}