public class T7Q4 {

    // Resource A and B
    static class Resource {
        public synchronized void methodA(Resource other) {
            System.out.println(Thread.currentThread().getName() + " is in methodA");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            other.methodB();
        }

        public synchronized void methodB() {
            System.out.println(Thread.currentThread().getName() + " is in methodB");
        }
    }

    public static void main(String[] args) {
        Resource resource1 = new Resource();
        Resource resource2 = new Resource();

        // Simulating Deadlock: Thread 1 locks resource1 and tries to lock resource2
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                resource1.methodA(resource2);  // Thread 1 locks resource1, then tries to lock resource2
            }
        }, "Thread-1");

        // Simulating Deadlock: Thread 2 locks resource2 and tries to lock resource1
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                resource2.methodA(resource1);  // Thread 2 locks resource2, then tries to lock resource1
            }
        }, "Thread-2");

        // Start both threads
        t1.start();
        t2.start();
    }
}

