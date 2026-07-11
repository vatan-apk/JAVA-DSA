public class Swaping{

public class Node{
    Node next ;
    int data;
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
        System.out.print(temp.data+" ");
        temp = temp.next;
    }
    System.out.println("null");
}

public static void swap(int n,int m,Node head){
int size = 0;
Node temp = head;
while(temp != null){ 
    size++;
    temp = temp.next;
}
int index1 = size-n;
int index2 = size -m;


Node node1 = head;
Node node2 = head;

for(int i=0;i<index1;i++){
    node1 = node1.next;
}
for(int j=0;j<index2;j++){
    node2 = node2.next;
}
int tem = node1.data;
node1.data = node2.data;
node2.data = tem;

}

public static void main(String[] args) {
    Swaping ll = new Swaping();
    ll.AddFront(1);
    ll.AddFront(2);
    ll.AddFront(3);
    ll.AddFront(4);
    ll.AddFront(5);
    ll.print();
    ll.swap(2,3,ll.head);
    ll.print();
}
}
