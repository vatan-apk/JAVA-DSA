
public class SealingOfNo {
      public static void main(String[] args) {
      int[] arr={12,23,34,45,56,67};
      System.out.print(fun(arr,55));  
      }

      static int fun(int[] arr,int target){
      int front=0;
      int last=arr.length-1;
      while (front<=last) {
        int mid=(front+last)/2;
        if(target==arr[mid]){
            return arr[mid];
        }else if(target>arr[mid]){
        front=mid+1;            
        }
        else {
            last=mid-1;  
        }
        
        
      }
      if(front>=arr.length){
        return -1;
      }
      return arr[front];
      
        
          }


}
