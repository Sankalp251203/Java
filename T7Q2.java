public class T7Q2 {

    // Runnable task that prints numbers 1 to 10
    static class NumberPrinter implements Runnable {
        private String threadName;

        public NumberPrinter(String threadName) {
            this.threadName = threadName;
        }

        @Override
        public void run() {
            for (int i = 1; i <= 10; i++) {
                System.out.println(threadName + " - " + i);
                try {
                    Thread.sleep(300); // Sleep to simulate time delay
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Create two Runnable instances with different names
        Runnable task1 = new NumberPrinter("Thread-1");
        Runnable task2 = new NumberPrinter("Thread-2");

        // Create two threads
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task2);

        // Start both threads
        t1.start();
        t2.start();
    }
}
