package binary_search_tree;

public class AVL_Delete {

	// Node structure for the AVL tree.
	// height stores the height of the subtree rooted at this node.
	static class Node {
		int data, height;
		Node left, right;

		Node(int data) {
			this.data = data;
			this.height = 1;
		}
	}

	public static Node root;

	// Returns the height of a node.
	// Note: null nodes have height 0.
	public static int height(Node root) {
		return (root == null) ? 0 : root.height;
	}

	// Returns the larger of two values.
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}

	// Computes the balance factor of a node.
	// balance = height(left subtree) - height(right subtree)
	public static int getBalance(Node root) {
		return (root == null) ? 0 : height(root.left) - height(root.right);
	}

	// Right rotation used when the tree becomes left-heavy.
	// This fixes the LL imbalance.
	public static Node rightRotate(Node y) {
		Node x = y.left;
		Node T2 = x.right;

		x.right = y;
		y.left = T2;

		y.height = max(height(y.left), height(y.right)) + 1;
		x.height = max(height(x.left), height(x.right)) + 1;

		return x;
	}

	// Left rotation used when the tree becomes right-heavy.
	// This fixes the RR imbalance.
	public static Node leftRotate(Node x) {
		Node y = x.right;
		Node T2 = y.left;

		y.left = x;
		x.right = T2;

		x.height = max(height(x.left), height(x.right)) + 1;
		y.height = max(height(y.left), height(y.right)) + 1;

		return y;
	}

	// Standard AVL insertion.
	// 1) Insert like a BST
	// 2) Update height
	// 3) Rebalance using rotations if needed
	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		}

		if (data < root.data) {
			root.left = insert(root.left, data);
		} else if (data > root.data) {
			root.right = insert(root.right, data);
		} else {
			return root;
		}

		root.height = 1 + max(height(root.left), height(root.right));

		int balance = getBalance(root);

		if (balance > 1 && data < root.left.data) {
			return rightRotate(root);
		}

		if (balance < -1 && data > root.right.data) {
			return leftRotate(root);
		}

		if (balance > 1 && data > root.left.data) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && data < root.right.data) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	// Finds the node with the smallest value in a subtree.
	// Used during deletion when replacing a node with its inorder successor.
	private static Node minValueNode(Node root) {
		Node current = root;
		while (current != null && current.left != null) {
			current = current.left;
		}
		return current;
	}

	// AVL deletion.
	// Important notes:
	// - Deletion follows BST deletion rules first.
	// - After removing the node, heights are updated.
	// - The tree is rebalanced using the four AVL rotation cases.
	public static Node delete(Node root, int key) {
		if (root == null) {
			return null;
		}

		if (key < root.data) {
			root.left = delete(root.left, key);
		} else if (key > root.data) {
			root.right = delete(root.right, key);
		} else {
			if (root.left == null || root.right == null) {
				Node temp = (root.left != null) ? root.left : root.right;

				if (temp == null) {
					root = null;
				} else {
					root = temp;
				}
			} else {
				Node temp = minValueNode(root.right);
				root.data = temp.data;
				root.right = delete(root.right, temp.data);
			}
		}

		if (root == null) {
			return null;
		}

		root.height = 1 + max(height(root.left), height(root.right));
		int balance = getBalance(root);

		if (balance > 1 && getBalance(root.left) >= 0) {
			return rightRotate(root);
		}

		if (balance > 1 && getBalance(root.left) < 0) {
			root.left = leftRotate(root.left);
			return rightRotate(root);
		}

		if (balance < -1 && getBalance(root.right) <= 0) {
			return leftRotate(root);
		}

		if (balance < -1 && getBalance(root.right) > 0) {
			root.right = rightRotate(root.right);
			return leftRotate(root);
		}

		return root;
	}

	// Preorder traversal: Root -> Left -> Right
	// Useful for viewing the final tree structure after balancing.
	public static void preorder(Node root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preorder(root.left);
		preorder(root.right);
	}

	// Demo:
	// Build an AVL tree, print it, delete nodes, and print again.
	// This helps verify that deletion keeps the tree balanced.
	public static void main(String[] args) {
		root = insert(root, 10);
		root = insert(root, 20);
		root = insert(root, 30);
		root = insert(root, 40);
		root = insert(root, 50);
		root = insert(root, 25);

		System.out.print("Before deletion: ");
		preorder(root);
		System.out.println();

		root = delete(root, 40);
		System.out.print("After deleting 40: ");
		preorder(root);
		System.out.println();

		root = delete(root, 30);
		System.out.print("After deleting 30: ");
		preorder(root);
	}
}
