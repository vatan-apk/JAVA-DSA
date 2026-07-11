public class hw4 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4};
        System.out.println(fun(arr));
    }
    public static boolean  fun(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=1+i;j<arr.length;j++){
                if(arr[i]==arr[j]){
return true;
                }
            }
        }
     return false;
    }
}
