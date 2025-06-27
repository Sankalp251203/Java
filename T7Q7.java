import java.util.LinkedList;
import java.util.Queue;

public class T7Q7 {

    static class SharedQueue {
        private final Queue<Integer> queue = new LinkedList<>();
        private final int MAX_SIZE = 5;

        // Method for the producer to add items
        public synchronized void produce() throws InterruptedException {
            while (queue.size() == MAX_SIZE) {
                // Wait if the queue is full
                System.out.println("Queue is full, Producer is waiting...");
                wait();
            }
            // Add item to the queue
            queue.add(1);  // In a real scenario, you'd add a unique item
            System.out.println("Produced item, current queue size: " + queue.size());
            // Notify the consumer that an item has been added
            notify();
        }

        // Method for the consumer to consume items
        public synchronized void consume() throws InterruptedException {
            while (queue.isEmpty()) {
                // Wait if the queue is empty
                System.out.println("Queue is empty, Consumer is waiting...");
                wait();
            }
            // Remove item from the queue
            queue.poll();
            System.out.println("Consumed item, current queue size: " + queue.size());
            // Notify the producer that space is available
            notify();
        }
    }

    static class Producer implements Runnable {
        private final SharedQueue sharedQueue;

        public Producer(SharedQueue sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    sharedQueue.produce();
                    Thread.sleep(1000); // Simulate time taken to produce an item
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class Consumer implements Runnable {
        private final SharedQueue sharedQueue;

        public Consumer(SharedQueue sharedQueue) {
            this.sharedQueue = sharedQueue;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    sharedQueue.consume();
                    Thread.sleep(1500); // Simulate time taken to consume an item
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        SharedQueue sharedQueue = new SharedQueue();

        // Create producer and consumer threads
        Thread producerThread = new Thread(new Producer(sharedQueue));
        Thread consumerThread = new Thread(new Consumer(sharedQueue));

        // Start the threads
        producerThread.start();
        consumerThread.start();
    }
}
