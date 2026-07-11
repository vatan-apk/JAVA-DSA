import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       int [] arr = new int [5];
    //    arr[0]=34;
    //    arr[1]=45;
    //    arr[2]=54;
    //    arr[3]=565;
    //    arr[4]=985;
    //    for(int i=0;i<=4;i++){
    //    System.out.println(arr[i]);
    for(int i=0;i<arr.length;i++){
        arr[i]=in.nextInt();
    }
    // for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    // }
    for(int num : arr){// for ever element in array, print the element
        System.out.println(num+" "); //num represent the element of the array
    }
       }
    }

  