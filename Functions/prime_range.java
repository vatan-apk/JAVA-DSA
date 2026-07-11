import java.util.*;
public class prime_range {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your range number :");
        int n=in.nextInt();
       for(int i=2;i<=n;i++){
          if(isprime(i)){
System.out.print(i+" ");
          }

       }

    }
    public static boolean isprime(int a){
        if(a<=1){
return false;
        }
    for(int i=2;i<=Math.sqrt(a);i++){
        if(a%i==0){
            return false;
        }
    }

    return true;
    }
}
