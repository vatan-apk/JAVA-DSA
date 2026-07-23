package loops;

import java.util.*;
public class do_while {
    public static void main(String args[]) {
  Scanner in = new Scanner(System.in);
  System.out.print("ENTER YOUR NUMBER :");
 int n = in.nextInt();
 boolean flag=true;
 if(n==1){
    System.out.println("not a prime");
 }else{
    for(int i=2;i<=Math.sqrt(n);i++){
        if(n%i==0){
            flag=false;
        }
    }
 }
 if(flag){
     System.out.println("Prime number");

 }else{
    System.out.println("not a prime");
 }

    }
}
