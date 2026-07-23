import java.util.Arrays;
public static int[] fun(int arr[]){
int n= arr.length;
for(int i=0;i<n-1;i++){
    int j=i;
    while(j>0 && arr[j-1]>arr[j]){
        int temp=arr[j-1];
        arr[j-1] =arr[i];
        arr[j]= temp;
        j--;
    }
}
return arr;
}

public static void main(String[] args) {
    int[] arr = {6,5,4,3,2,1};
    for(int i=0;i<arr.length;i++){

   System.out.println(Arrays.toString(fun(arr)));
    }
}