package loops;

import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int ans=0;
        Scanner in = new Scanner(System.in);
        System.out.print("enter your operator :");
        char op= in.next().trim().charAt(0);

        while(true){
        if( op =='+' || op == '-' || op == '*' || op== '/'|| op=='%'){
        System.out.println("enter your number :");
        int num1= in.nextInt();
        int num2= in.nextInt();
        if(op =='+'){ 
ans = num1+num2;
        }
        if(op =='-'){
ans = num1-num2;
        }
        if(op =='*'){
ans = num1*num2;
        }
        if(op =='/'){
ans = num1/num2;
        }
        if(op =='%'){
ans = num1%num2;
        }

    }else if(op == 'S' || op == 's'){
        break;
    }
    
    else{
        System.out.println("INVALID OPERATION");
        break;
    }
    System.out.print("YOUR ASNWER IS :");
    System.out.println(ans);
    }
}
}