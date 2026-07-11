public class LeetSearchRange {
    public static void main(String[] args) {
        
    
    int [] arr={12,23,23,45,56,56,466};
    int key=56;
    int first= findFirst(arr, key);
    int last = findlast(arr, key);
    System.out.println(first);
    System.out.println(last);
   

    }

   static int findFirst(int[] arr,int key){
    int first =0;
    int ans=-1;
    int last=arr.length-1;
    while(first<=last){
        int mid=(first+last)/2;
      if(key==arr[mid]){
        ans=mid;
        last=mid-1; // keep searching left
      }else if(key>arr[mid]){
        first=mid+1;
      }else{
        last= mid-1;
      }
    }
    return ans;
   }

   static int findlast(int[] arr,int key){
    int first =0;
    int ans=-1;
    int last=arr.length-1;
    while(first<=last){
        int mid=(first+last)/2;
      if(key==arr[mid]){
        ans=mid;
        first=mid+1; // keep searching right
      }else if(key>arr[mid]){
        first=mid+1;
      }else{
        last= mid-1;
      }
    }
    return ans;
   }
}
