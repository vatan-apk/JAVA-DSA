import java.util.Scanner;

public class leapyear {
  public static void main(StringArray[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print(" ENTER YOUR NUMBER :");
    int num = input.nextInt();
    if( (num%400==0) || (num%4==0 && num%100!=0)){
        System.out.println(num+" It is an leap year ");
    }
    else{
        System.out.println(num+" Is not an leap year ");
    }

  }
    
}
