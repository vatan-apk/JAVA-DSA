import java.util.*;
public class BinaryTrees{

static class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

    static int idx =-1;
    public static Node buildTree(int nodes[]){
        idx++;
        if(nodes[idx]==-1){
            return null;
        }
        Node newNode = new Node(nodes[idx]);
        newNode.left = buildTree(nodes);
        newNode.right = buildTree(nodes);
        return newNode;
    }
// preorder traversal
    public static void preorder(Node root){
    if(root==null){
        return;
    }
    System.out.println(root.data+" ");
    preorder(root.right);
    preorder(root.left);
}

// inorder traversal
public static void inorder(Node root){
    if(root == null){
        return;
    }
    inorder(root.left);
    System.out.print(root.data+" ");
    inorder(root.right);
}

// postorder
public static void postorder(Node root){
    if(root == null){
        return;
    }
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.data+" ");
}

public static void levelOrder(Node root){
    if(root == null){
        return;
    }
    Queue<Node> q = new LinkedList<>();
    q.add(root);
    q.add(null);

    while(!q.isEmpty()){
    Node currNode = q.remove();
    if(currNode == null){
        System.out.println("");
    if(q.isEmpty()){
        break;
    }else{
        q.add(null);
    }
    }else{
        System.out.print(currNode.data+" ");
        if(currNode.left != null){
            q.add(currNode.left);
        }
        if(currNode.right !=null){
            q.add(currNode.right);
        }
    }
    }
}

// Height of an Binary Tree
public static int height(Node root){
    if(root == null){
        return 0;
    }
    
    int left = height(root.left);
    int right = height(root.right);
    return  Math.max(left,right)+1;
}

// count no of nodes in Binary tree

public static int count(Node root){
    if(root==null){
        return 0;
    }
   int left = count(root.left);
   int right = count(root.right);
   return left+right+1;
}

// sum of nodes

public static int sum(Node root){
    if(root==null){
        return 0;
    }
   int left = sum(root.left);
   int right = sum(root.right);
   return left+right+root.data;
}

// Diameter of a tree
public static int diameter(Node root){
    if(root == null){
        return 0;
    }
    int Leftdia = diameter(root.left);
    int leftHt = height(root.left);
    int Rightdia = diameter(root.right);
    int rightHt =height(root.right);
    int selfDia = leftHt + rightHt +1;
    return Math.max(selfDia,Math.max(Leftdia,Rightdia)); 
}

static class Info{
    int diam;
    int ht;
    public Info(int diam,int ht){
        this.diam=diam;
        this.ht=ht;
    }
}
public static Info diameter2(Node root){
    Info leftInfo = diameter2(root.left);
    Info rightInfo = diameter2(root.right);

    int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam),leftInfo.ht+rightInfo.ht);
    int ht = Math.max(leftInfo.ht,rightInfo.ht)+1;
    return new Info(diam,ht);
}

public static void main(String[] args) {
            //    1
            //   / \
            //  2   3
            // / \  / \ 
            // 4  5 6 7 
            Node root = new Node(1);
            root.left = new Node(2);
            root.right = new Node(3);
            root.left.left= new Node(4);
            root.left.right=new Node(5);
            root.right.left= new Node(6);
            root.right.right = new Node(7);

            System.out.println(diameter(root));
} 




}
// public static void main(String[] args) {
// int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
// BinaryTree tree = new BinaryTree();
// Node root = tree.buildTree(nodes);
// //System.out.println(root.data);
// // tree.preorder(root);
// //tree.inorder(root);
// //tree.postorder(root);
// tree.levelOrder(root);
// }

