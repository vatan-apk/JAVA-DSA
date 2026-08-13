package Hashing;
import java.util.*;
public class basic2 {
    public static void main(String[] args){
        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("USA", 200);
        hm.put("London",403);
        hm.put("Indonesia",4);
        hm.put("Nepal",55);

        //Iterate
        Set<String> keys = hm.keySet();
        System.out.println("Keys: " + keys);
        for(String k:keys){
            System.out.println(k + "->" + hm.get(k));
        }

    }
}


