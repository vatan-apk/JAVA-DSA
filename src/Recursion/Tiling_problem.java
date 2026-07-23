package recursion;

public class Tiling_problem {
public static void main(String[] args) {
    System.out.print(fun(2));
}
public static int fun(int n){
    if(n==0 || n==1){
        return 1;
    }
    int nm1= fun(n-1);
    int nm2= fun(n-2);
    int total = nm1+nm2;
    return total;
}
}