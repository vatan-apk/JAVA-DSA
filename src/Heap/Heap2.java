package Heap;

import java.util.ArrayList;

public class Heap2 {
    ArrayList<Integer> arr = new ArrayList<>();

    public void add(int data){
        //add at last idx
        arr.add(data);
        int par = (arr.size()- 2)/2;
        int child = arr.size()-1;
        while(par>=0 && arr.get(par)>arr.get(child)){
            int temp = arr.get(par);
            arr.set(par,arr.get(child));
            arr.set(child,temp);
            child = par;
            par = (child-1)/2;
        }
    }
    public int peek(){
        return arr.get(0);
    }
    private void heapify(int i){
        int left = 2*i+1;
        int right = 2*i+2;
        int minIdx = i;
        if(left<arr.size() && arr.get(left)<arr.get(minIdx)){
            minIdx = left;
        }
        if(right<arr.size() && arr.get(right)<arr.get(minIdx)){
            minIdx = right;
        }
        if(minIdx!=i){
            int temp = arr.get(i);
            arr.set(i,arr.get(minIdx));
            arr.set(minIdx,temp);
            heapify(minIdx);
        }
    }
    public int remove() {
        int data = arr.get(0);
        int lastIdx = arr.size() - 1;
        arr.set(0, arr.get(lastIdx));
        arr.remove(lastIdx);
        heapify(0);
        return data;
    }
    public boolean isEmpty(){
        return arr.isEmpty();
    }
    public static void main(String args[]){
        Heap2 h = new Heap2();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);
        while(!h.isEmpty()){
            System.out.print(h.peek());
            h.remove();
        }
    }
}
