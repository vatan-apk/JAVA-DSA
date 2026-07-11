import java.util.Scanner;

public class greatestofnumbers {
    public static void main(StringArray[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your numbers :");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
    if(a>=b && a>=c){
        System.out.println("A is greater");
    }
    else if(b>=a && b>=c){
        System.out.println("B is greater");
    }
    else{
        System.out.println("c is grestest");
    }


    } 
}
