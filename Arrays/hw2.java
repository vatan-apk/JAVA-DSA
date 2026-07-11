public class hw2 {
    public static void main(String[] args) {
        int[] arr={7,6,4,3,1};
        System.out.println(fun(arr));
    }
    public static int fun(int arr[]){
int MaxBuy=Integer.MAX_VALUE;
int Maxprices = 0;
for(int i=0;i<arr.length;i++){
    if(MaxBuy<arr[i]){
        int profit = arr[i]-MaxBuy;
Maxprices = Math.max(Maxprices,profit);
    }else{
        MaxBuy=arr[i];
    }
}
return Maxprices;
    }
}
