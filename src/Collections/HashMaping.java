import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public static void main(String[] args){
    HashMap<String, Integer> map =new HashMap<>();

    map.put("Mumbai", 34);
    map.put("Vizag",35);
    map.put("delhi",37);

    System.out.println(map);

    if(map.containsKey("vizag")){
        System.out.println("Key is present");
    }else{
        System.out.println("Key is not present");
    }

    for(Map.Entry<String, Integer> e : map.entrySet()){
        System.out.print(e.getKey()+" ");
        System.out.println(e.getValue());
    }
    Set<String> keys = map.keySet();
    for(String key : keys){
        System.out.println(key+" "+map.get(key));
    }
}