import java.util.Arrays;

public class Prefic_Problem {
    public static class Node {
        Node[] children = new Node[26];
        boolean eow = false;

        public Node() {
            Arrays.fill(children, null);
        }
    }

    private static final Node root = new Node();

    public static void insert(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }

    public static boolean search(String word) {
        Node curr = root;
        for (int i = 0; i < word.length(); i++) {
            int idx = word.charAt(i) - 'a';
            if (curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow;
    }

    // startsWith(prefix) -> Check whether the given prefix exists as a path in trie
    // It does NOT check eow (end of word), only path existence
    public static boolean startsWith(String prefix) {
        Node curr = root; // start from root

        // Example: prefix = "do"
        // Step 1: 'd' -> move to root.children['d']
        // Step 2: 'o' -> move to root.children['d'].children['o']
        // If at any step the character is missing, return false
        for (int i = 0; i < prefix.length(); i++) {
            int idx = prefix.charAt(i) - 'a'; // convert char to index (a=0, b=1, ..., z=25)
            if (curr.children[idx] == null) { // if path does not exist
                return false; // prefix not found
            }
            curr = curr.children[idx]; // move to next node
        }

        // If all characters of prefix are found, prefix exists
        return true;
    }

    public static int countNodes(Node root){
        if(root == null){
            return 0;
        }
        int count =0;
        for(int i=0;i<26;i++){
            if(root.children[i]!=null){
                count+=1;
                count += countNodes(root.children[i]);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] arr = {"zebra", "dog", "duck", "dove"};
        String str = "ababa";
        // for (String word : arr) {
        //     insert(word);
        // }
        for(int i=0;i<str.length();i++){
            String suffix = str.substring(i);
            insert(suffix);
        }


        // System.out.println("search(\"dog\") = " + search("dog"));
        // System.out.println("search(\"do\") = " + search("do"));
        // System.out.println("startsWith(\"do\") = " + startsWith("do"));
        // System.out.println("startsWith(\"cat\") = " + startsWith("cat"));

        // Dry run for startsWith("do")
        // Trie contains: zebra, dog, duck, dove
        // Path for "do" exists because:
        // root -> d -> o
        // Therefore startsWith("do") returns true

        // Dry run for startsWith("cat")
        // root -> c does not exist
        // So loop hits curr.children['c'] == null and returns false
    }
}