// Jeremi Toroj 28.10.2023

public class PriorityQueue {

    private final int[][] heap;
    private int size;

        public PriorityQueue() {
            heap = new int[1000][2];
            size = 0;
        }

        public PriorityQueue(int capacity) {
            heap = new int[capacity][2];
            size = 0;
        }

        boolean isEmpty() {
            return size == 0;
        }


        public void add(Integer value, int priority) throws IllegalStateException{
            if (size == heap.length) {
                throw new IllegalStateException("Queue is full");
            }

            if (isEmpty()){
                heap[size] = new int[]{value, priority};
            }
            else {
                int i = 0;
                while (i < size && heap[i][1] <= priority) {
                    i++;
                }
                for (int j = size; j > i; j--) {
                    heap[j] = heap[j - 1];
                }
                heap[i] = new int[]{value, priority};
            }
            size++;
        }


        Integer get() throws IllegalStateException {
            if (isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            int[] result = heap[0];
            for (int i = 0; i < size - 1; i++) {
                heap[i] = heap[i + 1];
            }
            size--;
            return result[0];
        }

}
