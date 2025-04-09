import java.util.*;

public class Mavenprojecta {
    public static void main(String[] args) {
        PriorityQueue<String> stringQueue = new PriorityQueue<>();

        stringQueue.add("ab");
        stringQueue.add("abcd");
        stringQueue.add("abc");
        stringQueue.add("a");

        while (!stringQueue.isEmpty()) {
            System.out.println(stringQueue.poll());
        }
    }
}