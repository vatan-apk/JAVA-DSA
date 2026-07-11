import java.util.Scanner;

public class Hypotenuse {
    public static void main(String[] args) {

        Scanner in= new Scanner(System.in);
        double a;
        double b;
        double c;
        System.out.println("ente the values of (a,b) : ");
        a=in.nextInt();
        b=in.nextInt();
       /// c=Math.sqrt((a*a)+(b*b));
       /// or
       c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("answer of your hypo is : "+c+" cm");
    }
}
