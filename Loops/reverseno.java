public class reverseno {

    public static void main(String[] args) {
        int n = 1221;
        int original=n;
        int ans = 0;
        while (n>0) {
        int rem = n%10;
        n=n/10;
        ans = ans *10+rem;
            
        }
        if(original==ans){
            System.out.println("pallendrome");
        }else{
            System.out.println("not an pallendrome");
        }
    }
}
