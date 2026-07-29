



public class basic{
public static class Node{
    int data;
    Node next;

    public Node(int data){
    this.data=data;
    this.next=null;
    }
}

public static Node head;
public static Node tail;
public static int size;

public static void addEle(int data){
    Node newNode = new Node(data);
    if(head==null){
    head = tail = newNode;
    return;
    }
    newNode.next = head;
    head = newNode;
}

public static void print(){
    if(head==null){
    System.out.println("LinkedList is empty");
    }
    size++;
    Node temp = head;
    while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
    }
System.out.println();
}

public static void Addmiddle(int idx,int data){
    if(idx==0){
        addEle(data);
        return;
    }
    Node node = new Node(data);
    Node temp=head;
    int i=0;
    while(i<idx-1){
    temp = temp.next;
    i++;
    }
    node.next = temp.next;
    temp.next = node;
}

public static void reverse(){
    Node prev = null;
    Node curr = head;
    while(curr!=null){
        Node next = curr.next;
        curr.next = prev;
        prev = curr;
        curr =next;
         
        
    }
    head = prev;
}



    public static void main(String[] args) {
    
    addEle(5);
    addEle(4);
    addEle(3);
    addEle(2);
    addEle(3);
    addEle(2);
    addEle(1);

    print();
    Addmiddle(4,7);
    print();
    reverse();
    print();
    }
}