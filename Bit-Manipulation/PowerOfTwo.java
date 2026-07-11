
public class PowerOfTwo{
    public static void main(String[] args) {
        System.out.println(fun(12));
    }
    public static int fun(int n ){

        if ((n&(n-1)) == 0) {
            return 1;
        }else{
            return -1;
        }
    }
}