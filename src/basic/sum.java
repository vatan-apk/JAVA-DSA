package basic;

import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
       // System.out.print("ENTER YOUR INPUT :");
        float a = input.nextFloat();
        float b= input.nextFloat();
        float sum= a+b;
        System.out.println("YOUR SUM IS : "+sum);
    }
} 
