package linkedlist;


public class LL{

public static class Node{
    int data ;
    Node next;
    public Node(int data){
        this.data = data;
        this.next=null;
    }
}

public static Node head;
public static Node tail;

public static void AddFront(int data){
    Node newNode = new Node(data); 
    if(head == null){
        head = tail = newNode;
        return ;
    }
    newNode.next=head;
    head = newNode;
}

public static void AddBack(int data){
    Node newNode = new Node(data);
    if(head == null){
        head = tail = newNode;
        return;
    }
    
    tail.next = newNode;
    tail = newNode; 
}

public void print(){
    if(head == null){
        System.out.println("Empty");
        return;
    }
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println();
}
    public static void main(String[] args) {
    LL lil = new LL();
    lil.AddFront(1);
    lil.AddFront(2);
    lil.AddFront(3);
    lil.AddFront(4);
    lil.AddFront(5);
    lil.AddBack(0);
    lil.print();
    }
}