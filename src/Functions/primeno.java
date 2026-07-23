package functions;

import java.util.Scanner;

public class primeno {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("ENTER YOUR NO :");
        int n=in.nextInt();
        if(n<=1){
            System.out.println("not an prime number ");
        }
        else{
            boolean flag =true;  
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    flag=false;
                    break;  
                }  
            } 
        
            if(flag){
                System.out.println(n+" it is an prime number");
             } else{
                System.out.println(n+" not an prime number");
         
        }

    }
    
}
}
