package leet_chef;

public class q2{
    public static void main(String args[]){
        int[] arr= {1,8,6,2,5,4,8,3,7};
        int ans= (fun(arr)-1)*(fun(arr)-1);
        System.out.print(ans);
    }
    static int fun(int[] arr){
        int max =arr[0];
        for(int i=0;i<arr.length;i++){
           if(arr[i]>arr[max]){
            max=arr[i];
           }
            }
            return arr[max];
        }
    }

   