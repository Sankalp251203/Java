public class T7Q6 {

    static class LongTask implements Runnable {
        @Override
        public void run() {
            try {
                System.out.println(Thread.currentThread().getName() + " started the task.");
                // Simulate a long-running task (sleep for 5 seconds)
                Thread.sleep(5000);
                System.out.println(Thread.currentThread().getName() + " completed the task.");
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + " was interrupted during sleep.");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Create a thread to run the long task
        Thread taskThread = new Thread(new LongTask(), "TaskThread");

        // Start the thread
        taskThread.start();

        // Sleep for 2 seconds before interrupting
        Thread.sleep(2000);

        // Interrupt the task thread before it completes
        System.out.println("Main thread is interrupting the TaskThread.");
        taskThread.interrupt();

        // Wait for the task thread to finish
        taskThread.join();

        System.out.println("Main thread has finished.");
    }
}

