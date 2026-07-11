import java.util.*;
public class Multiplication_table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a=in.nextInt();
        int multi;
        for(int i=1;i<=10;i++){
    multi=a*i;
    System.out.println(multi);
        }
    }
}
