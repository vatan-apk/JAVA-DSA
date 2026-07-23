package linkedlist;

import java.util.*;

public class OddEven{

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
Node head;
public static int size;
public void AddFront(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    size++;
}

public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println("null");
}

public void EveOdd(){

ArrayList<Integer> even = new ArrayList<>();
ArrayList<Integer> odd = new ArrayList<>();

Node temp = head;
while(temp != null){
    if(temp.data%2 ==0){
        even.add(temp.data);
    }else{
odd.add(temp.data);
    }
    temp = temp.next;
}
temp = head;

for(int i=0;i<even.size();i++){
    temp.data = even.get(i);
    temp = temp.next;
}

for(int j=0;j<odd.size();j++){
    temp.data = odd.get(j);
    temp = temp.next;
}


}

    public static void main(String[] args) {
         OddEven ll = new OddEven();

        ll.AddFront(1);
        ll.AddFront(2);
        ll.AddFront(3);
        ll.AddFront(4);
        ll.AddFront(5);
        ll.EveOdd();
        ll.print();


    }
}