public class RangeSearch {
    public static void main(String[] args) {
        int[] arr= {12,23,34,45,56,67,89};
        int key= 23;
        System.out.println(fun(arr,key,0,4)+" in the list");
    }
    static int fun(int[] arr,int key, int start, int end ){
        if(arr.length==0){
            return -1;

        }
        else{
            for(int i=start;i<end;i++){
                if(arr[i]==key){
                    return arr[i]; 
                }
            } 
        }
        return -1;
    }
}
