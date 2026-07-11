import  java.util.*;
public class rev_star_tri {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a =in.nextInt();
        for(int i=0;i<=a;i++){
            for(int j=1;j<a-i+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
