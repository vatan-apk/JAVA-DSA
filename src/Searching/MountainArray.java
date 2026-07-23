package searching;

public class MountainArray {
    public static void main(String[] args) {
       
        int[] arr={3,5,7,9,8,6,2,1};
        //int key= 90;
        System.out.println(fun(arr));

 
    }
   static int fun(int[] arr){
    int first=0;
    int last=arr.length-1;
    
    while (first<last) {
         int mid=(last+first)/2;
        if(arr[mid]<arr[mid+1]){
        first=mid+1;
        }                                     
        else{
            last=mid; 
        }
    }
return arr[first];

   }
}
