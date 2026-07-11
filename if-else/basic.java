import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER :");
        int num = input.nextInt();
        if (num%2==0) {
            System.out.println(num+" Is a even number ");}
            else{
            System.out.println(num+" is odd number");
        }
    }
}
