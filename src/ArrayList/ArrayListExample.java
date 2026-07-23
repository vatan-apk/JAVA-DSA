package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ArrayListExample {

public static void swap(ArrayList<Integer> list, int idx1,int idx2){
    int temp = list.get(idx1);
    list.set(idx1,list.get(idx2));
    list.set(idx2,temp);

    System.out.println(list);
}

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
// sorting the lsit
        Collections.sort(list);
      //  System.out.println(list);
 //swap function       
        int idx1=1,idx2=3;
      //  swap(list,idx1,idx2);
    
        // for(int i=0;i<6;i++){
        //     list.add(in.nextInt());
        // }
        // for(int i=0;i<6;i++){
        //     System.out.println(list.get(i));
        // }
    Collections.sort(list,Collections.reverseOrder());
    System.out.println(list);
        // int max= Integer.MIN_VALUE;
        // for(int i=0;i<list.size();i++){
            // if(list.get(i)>max)
            // max = list.get(i);
        //     max= Math.max(max,list.get(i));
        // }

// System.out.println("Max element is: "+max);

    }


}
