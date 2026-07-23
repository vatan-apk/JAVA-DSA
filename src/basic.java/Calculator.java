package basic_java;

import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double num1;
        double num2;
        char operator;
        double res=0;
        System.out.println("Enter your first number : ");
        num1= in.nextInt();
        System.out.println("Enter your operator :");
        operator =in.next().charAt(0);
        System.out.println("Enter the second number :");
        num2 = in.nextInt();
        switch (operator) {
            case '+'-> res = num1+num2;
             case '-'-> res = num1-num2;
            case '*'-> res = num1*num2;
            case '/' ->{
                if(num2==0){
                    System.out.println("not divisible");
                }else{
res= num1/num2;
                }
            }  
            case '^' -> res= Math.pow(num1, num2);

                
        
            default -> System.out.println("Wrong entry");
        }
        System.out.println(res);
    }
}
