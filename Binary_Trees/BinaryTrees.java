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

// subtree of another tree

public static boolean isIdentical(Node node,Node subRoot){
    if(node == null || subRoot ==null){
        return true;
    }else if(node == null || subRoot ==null || node.data!=subRoot.data){
        return false;
    }
    if(!isIdentical(node.left, subRoot.left)){
        return false;
    }
    if(!isIdentical(node.right, subRoot.right)){
        return false;
    }
    return true;
}

public static boolean isSubtree(Node root,Node subRoot){
    if(root == null){
        return false;
    }
    if(root.data ==subRoot.data){
        if(isIdentical(root,subRoot)){
            return true;
        }
    }
    return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
}


// Top view of a tree
static class Infom{
    Node node ;
    int hd;
    public Infom(Node node,int hd){
        this.node=node;
        this.hd=hd;
    }
}

public static void topView(Node root){
    Queue<Infom> q = new LinkedList<>();
    HashMap<Integer,Node> map = new HashMap<>();
    int min =0,max=0;
    q.add(new Infom(root,0));
    q.add(null);
    while(!q.isEmpty()){
        Infom curr =q.remove(); 
        if(curr == null){
            if(q.isEmpty()){
                break;
            }else{
                q.add(null);
                continue;
            }
        }
        if(!map.containsKey(curr.hd)){
            map.put(curr.hd,curr.node);
        }
        if(curr.node.left != null){
            q.add(new Infom(curr.node.left,curr.hd-1));
            min=Math.min(min,curr.hd-1);
        }
        if(curr.node.right != null){
            q.add(new Infom(curr.node.right,curr.hd+1));
            max = Math.max(max,curr.hd+1);
        }
    }
    for(int i=min;i<=max;i++){
        System.out.print(map.get(i).data+" ");
    }
}

// Kth Level of a tree
public static void KLevel(Node root,int level,int k){
    if(root == null){
    return;
    }
    if(level==k){
        System.out.print(root.data+" ");
        return;
    }
    KLevel(root.left, level+1, k);
    KLevel(root.right, level+1, k);
}

//Lowest common Ancestor 

public static boolean getPath(Node root,int n,ArrayList<Node> path){

if(root == null){
    return false;
}
path.add(root);
if(root.data==n){
    return true;
}
boolean foundLeft =  getPath(root.left, n, path);
boolean foundRight = getPath(root.right, n, path);
if(foundLeft || foundRight){
    return true;
}
path.remove(path.size()-1);
return false;
}

public static Node lca(Node root,int n1,int n2){
ArrayList<Node> path1 = new ArrayList<>();
ArrayList<Node> path2 = new ArrayList<>();

getPath(root,n1,path1);
getPath(root,n2,path2);
int i=0;
for(;i<path1.size() && i<path2.size();i++){
    if(path1.get(i) != path2.get(i)){
        break;
    }
}
Node lca = path1.get(i-1);
return lca;
}

// Minimum Distance Brtween two nodes

public static Node lca2(Node root,int n1,int n2){
    if(root == null || root.data == n1 || root.data == n2){
        return root;
    }
    Node leftLca = lca2(root.left,n1,n2);
    Node rightLca = lca2(root.right,n1,n2);

    if(rightLca == null){
        return leftLca;
    }
    if(leftLca==null){
        return rightLca;
    }return root;
}

public static int lcaDist(Node root,int n){
    if(root == null){
        return -1;
    }
    if(root.data ==n){
        return 0;
    }
    int leftDist = lcaDist(root.left, n);
    int rightDist = lcaDist(root.right,n);

    if(leftDist == -1 && rightDist==-1){
        return -1;
    }else if(leftDist ==-1){
        return rightDist+1;
    }else{
        return leftDist+1;
    }
}



public static int minDist(Node root,int n1,int n2){
    Node lca = lca2(root,n1,n2);
    int dist1 = lcaDist(lca,n1);
    int dist2 = lcaDist(lca,n2);

    return dist1 + dist2;
}

// kth Ancestor
public static int KAncestor(Node root,int n,int k){
    if(root==null){
        return -1;
    }
    if(root.data ==n){
        return 0;
    }
    int leftDist = KAncestor(root.left, n, k);
    int rightDist=KAncestor(root.right, n, k);

    if(leftDist == -1 && rightDist ==-1){
        return -1;
    }
    int max = Math.max(leftDist,rightDist);
    if(max+1 == k){
        System.out.println(root.data);
    }
    return max+1;
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

//topView(root);
                    //     2
                    //    /  \
                    //   4    5

        //     Node subNode = new Node(2);
        //     subNode.left = new Node(6);
        //    // subNode.right = new Node(5); 
        //     System.out.println(isSubtree(root,subNode));

 int n = 5, k = 1;
 System.out.print(KAncestor(root, n, k)+" ");
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

