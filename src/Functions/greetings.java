package functions;

import java.util.Scanner;
public class greetings {
    public static void main(String[] args) {
        int ans = sum();
        System.out.println(ans);
    }
    static int sum(){
      Scanner in = new Scanner(System.in);
      System.out.println("enter your num1 :");
      int a = in.nextInt();
      System.out.println("enter your num2 :");
      int b = in.nextInt();
      int sum = a + b ;
      return sum;
    }
}
