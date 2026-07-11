import java.util.Scanner;
public class main {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        
        String name1=in.nextLine();
        int pieces = in .nextInt();
        float x= 12.99f;
        float y= 8.99f;

if(name1.equals("pizza")){
 float ans = x*pieces;
 System.out.println("Total amount is :$"+ans);
}else if(name1.equals("burger")){
float ans2 = y*pieces;
 System.out.println("Total amount is :$"+ans2);

}
    }
}
