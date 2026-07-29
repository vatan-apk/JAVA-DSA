import java.util.PriorityQueue;

public class Sliding_Window_Max {
    static class Pair implements Comparable<Pair> {
        int val;
        int idx;

        Pair(int val, int idx) {
            this.val = val;
            this.idx = idx;
        }

        @Override
        public int compareTo(Pair other) {
            if (this.val != other.val) {
                return Integer.compare(other.val, this.val);
            }
            return Integer.compare(this.idx, other.idx);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = new int[arr.length - k + 1];
        PriorityQueue<Pair> pq = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            pq.add(new Pair(arr[i], i));

            while (!pq.isEmpty() && pq.peek().idx <= i - k) {
                pq.poll();
            }

            if (i >= k - 1) {
                result[i - k + 1] = pq.peek().val;
            }
        }

        for (int value : result) {
            System.out.print(value + " ");
        }
    }
}