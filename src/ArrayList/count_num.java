package ArrayList;
import java.util.ArrayList;
import java.util.Objects;
public class count_num {
    public static ArrayList<Integer> fun(ArrayList<Integer> arr, int key) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i + 1 < arr.size(); i++) {
            if (Objects.equals(arr.get(i), key)) {
                list.add(arr.get(i + 1));
            }
        }
        return list;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(1);
        list.add(100);
        int key = 1;
        System.out.println(fun(list, key).size());
    }
}