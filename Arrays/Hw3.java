public class Hw3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        fun(arr);
    }
    public static void fun(int[] arr){
        int Max = Integer.MIN_VALUE;
        
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                    System.out.print(arr[k]+" ");
                }
                System.out.println(" Sum-> "+sum);
                if(sum>Max){
                    Max=sum;
                }
            }
           System.out.println();
        }
        System.out.println("total value : "+Max);
    }
}
