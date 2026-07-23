package sorting;


public class Bubble_sort {
    public static void main(String[] args) {
        int arr[]={5,3,6,4,7};
       
          int swaps = fun(arr);
          System.out.println("\nAfter sorting :");
          print(arr);
          System.out.println("\nTotal swaps: "+swaps);

    }
    public static int fun(int arr[]){
        int temp=0;
        int swap=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    
                     temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap++;
                }
            }
        }
return swap;
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
