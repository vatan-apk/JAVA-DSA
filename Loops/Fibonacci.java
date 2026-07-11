import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        System.out.print("ENTER YOUR NUMBER :");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a=0;
        int b=1,count=1;
        while (count <=n) {
            int temp =b;
            b=b+a;
            a=temp;
            count++;
            
        }
            System.out.println(a);
    }
}