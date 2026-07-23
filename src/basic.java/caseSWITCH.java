package basic_java;

import java.util.Scanner;
public class caseSWITCH {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int num=in.nextInt(); 
        switch (num) {
                case 1 ->
                System.out.println("Monday");
                
                case 2 ->
                System.out.println("Tuesday");
                
                case 3 ->
                System.out.println("Wednesday");
                
                case 4 ->  
                System.out.println("Thursday");
            
                case 5 ->
                System.out.println("friday");
                
                case 6 ->
                System.out.println("saturday");
                
                case 7 ->
                System.out.println("sunday");
                
            default ->
            System.out.println("invalid number !!");
                
        }
    }
}
