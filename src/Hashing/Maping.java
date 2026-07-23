import java.util.HashMap;

public static void main(String args[]){
    int[] arr = {1,3,2,1,3};
    int[] query = {1,4,2,3};
     HashMap<Integer, Integer> map = new HashMap<>();

    for(int num : arr){
        map.put(num, map.getOrDefault(num, 0)+1);
     }

    for(int q : query){
    System.out.print(map.getOrDefault(q, 0)+" ");
     }
}
//output
//2 0 1 2 

// number kitne repeat ho rahe hai!