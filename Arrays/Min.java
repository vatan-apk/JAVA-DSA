public class Min {
    public static void main(String[] args) {
        
    int[] arr= {12,23,34,56,67,78,89};
    System.out.println(min(arr));
    }
    static int  min(int[] arr){
        int min =  arr[0];
        for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min= arr[i];
        }
        }
        return min;
    }
}
