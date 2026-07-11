import java.util.Scanner;

public class whileloop {
    public static void main(StringArray[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("ENTER YOUR NUMBER :");
        int num = input.nextInt();
        int i=1;
        while (i<=num) {
            System.out.println(i);
            i++;
        }

    }
    
}
