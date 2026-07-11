public class InfiniteArrays {
    public static void main(String[] args) {
       
        int[] arr={3,5,7,9,90,123,345,567,789};
        int key= 90;
        System.out.println(findrange(arr, key));


    }
    static int findrange(int[] arr,int key){
         int start=0;
         int end=1;
         //condition for the target to lie in the rangee
         while(key>arr[end]){
            int newstart =end+1;
            // double the box value
            // end = previous end + sizeofbox*2
            end= end+(end-start+1)*2;
            start=newstart;
         }
         return binarySearch(arr, key, start,end);
    }
    static int binarySearch(int[] arr,int key,int start,int last){
        while(start<=last){
            int mid =(start+last)/2;
            if(key==arr[mid]){
                return arr[mid];
            }else if(key<arr[mid]){
                last =mid-1;
            } 
            else{
                start=mid+1;
            }
        }
        return -1;
    } 
}
