package Hashing;
import java.util.*;
public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> lhm = new LinkedHashMap<>();
        lhm.put("India",100);
        lhm.put("USA",200);
        lhm.put("UK",150);

        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("India",100);
        hm.put("USA",200);
        hm.put("UK",150);

        TreeMap<String,Integer> thm = new TreeMap<>();
        thm.put("India",100);
        thm.put("USA",200);
        thm.put("UK",150);

        System.out.println("LinkedHashMap: " + lhm);
        System.out.println("HashMap: " + hm);
        System.out.println("TreeMap: " + thm);
    }
}
