package loops;

import java.util.*;
public class Even_odd_sum {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int n=in.nextInt();
int even=0;
int odd=0;
for(int i=1;i<=n;i++){
    if(i%2==0){
        even+=i;
    }else{
        odd+=i;
    }
}
System.out.println("Sum of odd digit : "+odd);
System.out.println("sum of even digit :"+even);
    }
}
