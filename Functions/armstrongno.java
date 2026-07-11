import java.util.Scanner;

public class armstrongno {
    public static void main(StringArray[] args) {
        Scanner in = new Scanner(System.in);
       // System.out.println("ENETR THE NO :");
        //int n = in.nextInt();
       // System.out.println(isarmstrong(n));
       for(int i=100;i<=1000;i++){
        if(isarmstrong(i)){
            System.out.println(i+ " ");
        }
       }
    }
    static boolean isarmstrong(int n){
        int original = n;
        int sum =0;
        while(n>0){
            int rem = n%10;
            n=n/10;
            sum =sum + rem*rem*rem;
        }
        if(sum== original){
            return true;
        }
        return false;
    }
}
