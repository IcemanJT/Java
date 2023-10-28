// Jeremi Toroj 28.10.2023

public class Main {
    public static void main(String[] args) {

        PriorityQueue queue = new PriorityQueue(10);

        queue.add(1, 1);
        queue.add(2, 1);
        queue.add(3, 2);
        queue.add(4, 1);
        queue.add(5, 3);


        System.out.println(queue.get()); // 1
        System.out.println(queue.get()); // 2
        System.out.println(queue.get()); // 4
        System.out.println(queue.get()); // 3
        System.out.println(queue.get()); // 5

    }
}