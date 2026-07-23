package searching;

public class LeetLetterGreatKey {
    public static void main(String[] args) {
        String[] arr={"a","d","g","i","l","o","r"};
        System.out.println(fun(arr,"f"));
    }
    static String fun(String[] arr,String key){
        int  front=0;
      int last=arr.length-1;
      while (front<=last) {
        int mid=(front+last)/2;
        if(key.equals(arr[mid])){
            return arr[mid];
        }else if(key.compareTo(arr[mid])>0){
        front=mid+1;            
        }
        else {
            last=mid-1;  
        }
        
        
      }
      if(front>=arr.length){
        return "NOT FOUND";
      }
      return arr[front];
      
    }
}
