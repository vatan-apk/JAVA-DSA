import java.util.ArrayList;
import java.util.Collections;

    public static void main(String[] args) {
ArrayList<Integer> list = new ArrayList<>();
list.add(0);
list.add(2);
list.add(3);
System.out.print(list);

int element = list.get(2);
System.out.println(element);
//adding
list.add(1,1);
System.out.println(list);
 //update
 list.set(0,5);
 System.out.println(list);
 //delete
 list.remove(3);
 System.out.println(list);
//size
int size = list.size();
System.out.println(size);
//sorting
Collections.sort(list);
System.out.println(list);
    }
