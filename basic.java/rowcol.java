import java.util.Scanner;

public class rowcol {
    public static void main(String[] args) {
        int row; 
        int column;
        Scanner in = new Scanner(System.in);
        System.out.println("enter your row :");
        row = in.nextInt();
        System.out.println("enter your column :");
        column = in.nextInt();
for(int i=1;i<=column;i++){
      for(int j=0;j<row;j++){

          System.out.print("$");
      }
System.out.println();
}
    }
} 
