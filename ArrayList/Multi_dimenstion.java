
import java.util.ArrayList;
public class Multi_dimenstion{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList =new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        mainList.add(list);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(3);
        list2.add(4);
        mainList.add(list2); 

        for(int i=0; i<mainList.size();i++){
            ArrayList<Integer> currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
               // System.out.print(currList.get(j)+" ");
            }
          //  System.out.println();
        }
// Table of 3 , 5 ,7 in one main ArrayList
        ArrayList<ArrayList<Integer>> mainx = new ArrayList<>();
        ArrayList<Integer> listx = new ArrayList<>();
        ArrayList<Integer> listy = new ArrayList<>();
        ArrayList<Integer> listz = new ArrayList<>();
        for(int i=1;i<=10;i++){
            listx.add(i*3);
            listy.add(i*5);
            listz.add(i*7);
        }
        mainx.add(listx);
        mainx.add(listy);
        mainx.add(listz);
System.out.println(mainx);
for(int i=0;i<mainx.size();i++){
    ArrayList<Integer> curr = mainx.get(i);
    for(int j=0;j<curr.size();j++){
    System.out.print(curr.get(j)+" ");
    }
    System.out.println();
}
        
    }
}