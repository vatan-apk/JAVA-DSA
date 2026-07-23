package sorting;


import java.util.Arrays;
class Selection_Sort{
    public static void main(String[] args) {
        int arr[]={1,4,2,3,6,8};
        System.out.println(Arrays.toString(fun(arr)));
    }
public static int[] fun(int arr[]){
    for(int i=0;i<arr.length;i++){
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]>arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
    }
    return arr ;
}
}