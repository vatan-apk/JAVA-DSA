import java.util.*;

public class Questions{
    public static void  majorityElement(int arr[]){
     int n = arr.length; //9
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> keySet = map.keySet();
        for(Integer key: keySet){
            if(map.get(key)>n/3){
             System.out.println(key);
             break; 
            }
        }
    }

    public static boolean validAnagram(String str1,String str2){
    HashMap<Character,Integer> map = new HashMap<>();
    if(str1.length()!=str2.length()){
        return false;
    }
    for(int i=0;i<str1.length();i++){
    char ch = str1.charAt(i);
    map.put(ch,map.getOrDefault(ch, 0)+1);
    }  

    for(int i=0;i<str2.length();i++){
        char ch = str2.charAt(i);
        if(map.get(ch)!=null){
            if(map.get(ch)==1){
                map.remove(ch);
            }else{
        map.put(ch,map.get(ch)-1);
            }
        }else{
            return false;
        }
    }
        return map.isEmpty();
    }

    // set automatically unique he elements rakhta hai yee function likhne ke zarurat nhi hai bhai
    // normal for loop lagake insert kar dena set me
    
    public static int CountDistnctElement(int arr[]){
    HashSet<Integer> set = new HashSet<>();
    for(int el:arr){
        if(!set.contains(el)){
            set.add(el);
        }
    }
    return set.size();
    }

    // Union and Intersection of two arrays
    public static void UnIn(int arr1[],int arr2[]){
        HashSet<Integer> set = new HashSet<>();
        //Union
        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }
        for(int j=0;j<arr2.length;j++){
            set.add(arr2[j]);
        }
        System.out.println("Union = "+set.size());

        //Intersection

        set.clear();

        for(int i=0;i<arr1.length;i++){
            set.add(arr1[i]);
        }

        int count=0;

        for(int i=0;i<arr2.length;i++){
            if(set.contains(arr2[i])){
                count++;
                set.remove(arr2[i]);
            }
        }
    System.out.println("Intersection : "+count);

    }

    // Largest Sub Array Sum, Whose sum = 0;
   
    public static void LargestSub(int arr[]){
    HashMap<Integer,Integer> map = new HashMap<>();

    int sum=0;
    int len =0;

    for(int i=0;i<arr.length;i++){
        sum+=arr[i];
        if(map.containsKey(sum)){
            len = Math.max(len,i-map.get(sum));
        }else{
            map.put(sum,i);
        }
    } 

    System.out.println("Largest subArray with sum as 0 => "+len);

    } 
    public static void main(String[] args) {
    //     int arr[] = {1,3,2,5,1,3,1,5,1};
    //     int arr2[] ={4,3,2,5,6,7,3,4,2,1};
    //    System.out.println(CountDistnctElement(arr2)); 
    //     String str1 = "race";
    //     String str2 = "cara";
    //    System.out.println(validAnagram(str1, str2));

    int a[] = {7,3,9};
    int b[] = {6,3,9,2,9,4};
    //UnIn(a, b);

    int arrr[] = {15,-2,2,-8,1,7,10,23};

    LargestSub(arrr);


    }
}