import java.util.*;

public static boolean fun(ArrayList<Integer> list){
boolean dec = true;
boolean ass = true;
for(int i=0;i<list.size()-1;i++){
    if(list.get(i)>list.get(i+1)){
        dec=false;
    }
     if(list.get(i)<list.get(i+1)){
        ass = false;
    }
    }
    return dec || ass;
}

public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(3);
    list.add(2);
   // list.add(1);
    System.out.println(fun(list));
}