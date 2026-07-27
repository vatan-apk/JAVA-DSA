package Heap;

import java.util.PriorityQueue;

public class Heap {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name,int rank){
            this.name = name;
            this.rank=rank;
        }

        @Override
        public int compareTo(Student s2) {
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> minHeap = new PriorityQueue<>();

        minHeap.add(new Student("Alice", 3));
        minHeap.add(new Student("Bob", 4));
        minHeap.add(new Student("Charlie", 1));
        minHeap.add(new Student("David", 7));

        while (!minHeap.isEmpty()) {
            System.out.println(minHeap.peek().name + "->"+minHeap.peek().rank);
            minHeap.remove();
        }
    }
}