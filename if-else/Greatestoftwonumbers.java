import java.util.Scanner;

public class Greatestoftwonumbers {
    public static void main(StringArray[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("ENETR YOUR NUMBERS :");
    int num1= input.nextInt();
    int num2= input.nextInt();
    if(num1==num2){
        System.out.println(num1+" = "+num2);
    }
    else if(num1>num2){
        System.out.println(num1+" Is 'GREATER' and " +num2+" IS 'SMALLEST'");
        
    }
    else{
        System.out.println(num2+" Is 'GREATER' and " +num1+" IS 'SMALLEST'");
    }
    
    }
    }
    

