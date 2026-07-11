public class Delete{

public class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

Node head;
public void AddFront(int data){
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
}

public void print(){
    Node temp = head;
    while(temp != null){
        System.out.print(temp.data+"->");
        temp = temp.next;
    }
System.out.println("null");
}

public static  Node fun(int n , int m, Node head){
    int size =0;
    Node temp = head;
    while(temp != null){
        size++;
        temp = temp.next;
    }
    if(size == n){
        for(int j=0;j<m && head != null ; j++){
            head = head.next;
        }
    return head.next;
    }
    int index = size-n;
    Node prev = head;
    for(int i=1;i<index;i++){

        prev = prev.next;
    }
    for(int j=0;j<m && prev.next!= null;j++){
    prev.next = prev.next.next;

    }
    return head;
}

public static void main(String[] args) {
 Delete dd = new Delete()   ;
 dd.AddFront(1);
 dd.AddFront(2);
 dd.AddFront(3);
 dd.AddFront(4);
 dd.AddFront(5);
 dd.head = dd.fun(4,2,dd.head);
 dd.print();
}

}