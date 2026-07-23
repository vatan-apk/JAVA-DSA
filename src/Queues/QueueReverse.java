package queues;

import java.util.*;

public class QueueReverse{

    public static void function(Queue<Integer> q){
    Stack<Integer> qr = new Stack<>();
    while(!q.isEmpty()){ 
        qr.add(q.remove());
    }
    while(!qr.isEmpty()){
         q.add(qr.pop());
    } 
    }
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        function(q);
      while(!q.isEmpty()){
        System.out.print( q.remove()+" ");
      }
    }
}