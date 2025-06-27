public class T7Q1 {

    // Task 1: Executed in the main thread
    public static void task1() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Task 1 - Count: " + i);
            try {
                Thread.sleep(500); // Simulate some work
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    // Task 2: Will be executed concurrently using a new thread
    public static class Task2 extends Thread {
        public void run() {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Task 2 - Count: " + i);
                try {
                    Thread.sleep(500); // Simulate some work
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {
        // Start Task 2 in a new thread
        Task2 t2 = new Task2();
        t2.start();

        // Run Task 1 in the main thread
        task1();
    }
}
