import java.util.*;

public class QueueQb{

    public static void fun(int k, Deque<Integer> q){
    Queue<Integer> s = new LinkedList<>();
    int count=0;
    while(k!=count){ 
        s.add(q.removeFirst());
        count++;
    }
    while(!s.isEmpty()){
        q.addFirst(s.remove());
    }
        
    }

    public static void fun2(int k,PriorityQueue<Integer> pq){
    int cost=0;
    while(pq.size()>1){
        int first = pq.poll();
        int second = pq.poll();
     int   sum = first+second;
        cost+=sum;
        pq.add(sum);
    }    
    System.out.print(cost+" ");
    }
    
    public static void main(String[] args) {
        // Deque<Integer> d = new LinkedList<>();
        // d.addLast(10);
        // d.addLast(20);
        // d.addLast(30);
        // d.addLast(40);
        // d.addLast(50);
        // d.addLast(60);
        // d.addLast(70);
        // d.addLast(80);
        // d.addLast(90);
        // d.addLast(100);
        // fun(5,d);
        // while(!d.isEmpty()){
        //     System.out.print(d.removeFirst()+" ");
        // }

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    pq.add(4);
    pq.add(3);
    pq.add(2);
    pq.add(6);
    fun2(4,pq);
    
    }
}