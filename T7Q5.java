public class T7Q5 {

    // Shared counter class with synchronized method
    static class Counter {
        private int count = 0;

        // Synchronized method to increment the counter
        public synchronized void increment() {
            count++;
        }

        public int getCount() {
            return count;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        // Create 1000 threads that will increment the counter
        Thread[] threads = new Thread[1000];

        // Create and start threads
        for (int i = 0; i < 1000; i++) {
            threads[i] = new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.increment();  // Increment the counter
                }
            });
            threads[i].start();
        }

        // Wait for all threads to finish
        for (Thread t : threads) {
            t.join();
        }

        // Print the final counter value
        System.out.println("Final Counter Value: " + counter.getCount());
    }
}

