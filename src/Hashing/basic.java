package Hashing;


import java.util.HashMap;

public class basic {
public static void main(String[] args){

    // Create a HashMap where keys are Strings and values are Integers.
    HashMap<String,Integer> hm = new HashMap<>();

    // Add key-value pairs into the map.
    hm.put("Alice", 25);
    hm.put("Bob", 30);
    hm.put("Charlie", 35);

    // Print the complete HashMap.
    System.out.println(hm);

    // Get the value associated with the key "Bob".
    System.out.println(hm.get("Bob"));

    // Remove the entry with key "Alice" and print the removed value.
    System.out.println(hm.remove("Alice"));

    // Check whether the key "Charlie" exists in the map.
    System.out.println(hm.containsKey("Charlie"));

    // Check whether the value 30 exists in the map.
    System.out.println(hm.containsValue(30));

    // Print the updated HashMap after removal.
    System.out.println(hm);

}

}



