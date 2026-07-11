import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    double  r ;
    double area;
    System.out.println("Enter your radius : ");
    r= in.nextInt();
area = Math.PI*Math.pow(r,2);
System.out.println(area);
double vol;
vol= (4/3)*Math.PI*Math.pow(r, 3);
double circumference;
circumference = 2*Math.PI*r;
System.out.println(vol);
System.out.println(circumference);
    }
}
