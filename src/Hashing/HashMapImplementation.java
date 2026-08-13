package Hashing;
import java.util.*;
public class HashMapImplementation {
    static class HashMap<K, V> {
        private static class Node<K, V> {
            K key;
            V value;
            Node<K, V> next;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
                this.next = null;
            }
        }

        private final Node<K, V>[] buckets;
        private final int capacity;

        @SuppressWarnings("unchecked")
        public HashMap(int capacity) {
            if (capacity <= 0) {
                throw new IllegalArgumentException("Capacity must be greater than 0");
            }
            this.capacity = capacity;
            this.buckets = new Node[capacity];
        }

        private int getBucketIndex(K key) {
            return (key.hashCode() & 0x7fffffff) % capacity;
        }

        public void put(K key, V value) {
            int index = getBucketIndex(key);
            Node<K, V> newNode = new Node<>(key, value);

            if (buckets[index] == null) {
                buckets[index] = newNode;
            } else {
                Node<K, V> current = buckets[index];
                while (current != null) {
                    if (current.key.equals(key)) {
                        current.value = value; // Update existing key
                        return;
                    }
                    if (current.next == null) {
                        current.next = newNode; // Add new node at the end
                        return;
                    }
                    current = current.next;
                }
            }
        }

        public V get(K key) {
            int index = getBucketIndex(key);
            Node<K, V> current = buckets[index];

            while (current != null) {
                if (current.key.equals(key)) {
                    return current.value; // Key found
                }
                current = current.next;
            }
            return null; // Key not found
        }

        public void remove(K key) {
            int index = getBucketIndex(key);
            Node<K, V> current = buckets[index];
            Node<K, V> prev = null;

            while (current != null) {
                if (current.key.equals(key)) {
                    if (prev == null) {
                        buckets[index] = current.next; // Remove head node
                    } else {
                        prev.next = current.next; // Bypass the node to remove it
                    }
                    return;
                }
                prev = current;
                current = current.next;
            }
        }

        public Set<K> keySet() {
            Set<K> keys = new HashSet<>();

            for (Node<K, V> bucket : buckets) {
                Node<K, V> current = bucket;
                while (current != null) {
                    keys.add(current.key);
                    current = current.next;
                }
            }
            return keys;
        }

        static void main(String[] args) {
            HashMap<String, Integer> map = new HashMap<>(10);
            map.put("Alice", 25);
            map.put("Bob", 30);
            map.put("Charlie", 35);

            if (args != null && args.length > 0) {
                System.out.println("Command-line arguments are ignored by this demo.");
            }

            ArrayList<String> keys = new ArrayList<>(map.keySet());

            for(String key : keys){
                System.out.println(key + " -> " + map.get(key));
            }

            System.out.println("Alice's age: " + map.get("Alice"));
            System.out.println("Bob's age: " + map.get("Bob"));

            map.remove("Alice");
            System.out.println("Alice's age after removal: " + map.get("Alice"));
        }
    }
}
