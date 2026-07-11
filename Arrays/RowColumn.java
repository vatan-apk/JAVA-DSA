import java.util.Scanner;

public class RowColumn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int r =in.nextInt();
        System.out.println("enter no of rows : ");
        int c =in.nextInt();

        int a[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j]=in.nextInt();
            }
        }
    
    System.out.println("matrix form");
    for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            System.out.print(a[i][j]+" "); 
        }
        System.out.println();
    }
     


    }
    
}
